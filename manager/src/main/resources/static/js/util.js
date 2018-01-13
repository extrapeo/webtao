var util = function (){
    //判断浏览器是否未ie浏览器
    this.isIEN = function(){
        return !!window.ActiveXObject || "ActiveXObject" in window;
    }
    //验证对象是否为function
    this.isFunction = function(test){
        return test && typeof test == 'function';
    };
    //验证对象是否为时间
    this.isDate = function(data){
        return data && data instanceof Date;
    };
    //验证对象是否为字符串
    this.isString = function(test){
        return test && Object.prototype.toString.call(test) === "[object String]";
    };
    //验证对象是否为array
    this.isArray = function(list){
        return list&&Object.prototype.toString.call(list) === '[object Array]';
    };
    //验证某js对象是否json
    this.isJson = function(json){
        return json && typeof(json) == "object" && Object.prototype.toString.call(json).toLowerCase() == "[object object]" && !json.length;
    };
    //删除json中的某个数据
    this.jsonDeleteKey = function(json,key){
        if(!this.isJson(json)) return;
        if(!key) return;
        delete json[key];
    };
    //默认ajax参数
    this.defaultParam = defaultAjaxParam();
    //处理ajax 参数
    this.dealRequestParams = dealRequestParams;
    //定义jqueryAjax
    this.ajax = function (param){
        var dealResult = this.dealRequestParams(param);
        if(!dealResult ||  !dealResult.status || ! dealResult.param){
            return ;
        }
        // param = dealResult.param;
        $.ajax(dealResult);
        $.ajax({
            url:param.url,
            data:param.data,
            type:param.type,
            async:param.async,
            cache:param.cache,
            contentType:param.contentType,
            dataType:param.dataType,
            global:param.global,
            ifModified:param.ifModified,
            processData:param.processData,
            beforeSend:function(XMLHttpRequest){
                param.beforeSend && param.beforeSend(XMLHttpRequest);
            },
            complete:function (XMLHttpRequest, textStatus) {

            },
            error:function (XMLHttpRequest, textStatus, errorThrown) {

                // 通常情况下textStatus和errorThown只有其中一个有值
                // this; // the options for this ajax request
            },
            success:function (data, textStatus) {
                // data could be xmlDoc, jsonObj, html, text, etc...
                // this; // the options for this ajax request
            }
        });



    };
    //参数查询
    this.paramAjax = function(url , data , success, async , error ){
        var param = this.defaultParam;
        param.url = url;
        param.data = data;
        param.success = success;
        param.error = error;
        param.async = async;
        this.ajax(param);
    }
    //post提交数据
    this.post = function(url , data , success, async , error ){
        this.paramAjax(url , data , success, async , error );
    }
    //get 查询
    this.get = function(url , data , success, async , error ){
        this.paramAjax(url , data , success, async , error );
    }

}

window.utils = new util();

function dealRequestParams (param){
    var result = {
        status : false,
        param:param
    };
    if(param && utils.isJson(param)){
        var tempParam = utils.defaultParam;
        for(var key in param){
            tempParam[key] = param[key];
        }
        param = tempParam;
    }
    
    if(!utils.isJson(param) || !param.url){
        alert('无效请求！');
        return result;
    }

    //默认请求 get 方式
    if(!param.type){
        param.type = "GET";
    }else{
        if("POST" != param.type && "GET" != param.type && "PUT" != param.type && "DELETE" != param.type ){
            alert('无效请求类型！');
            return result;
        }
    }

    //timeout 超时时间设置

    //异步 true  同步 false async
    if(param.async){
        param.async = true;
    }else{
        param.async = false;
    }

    //beforeSend处理    1 默认值  2自定义 beforeSend==null则不进行处理
    if(!param.isBeforeSend || param.isBeforeSend !=2){
        param.isBeforeSend = 1;
    }
    if(param.isBeforeSend == 1){
        param.beforeSend = defaultBeforeSend;
    }
    if(!param.beforeSend){
        param.beforeSend = null;
    }

    // cache (默认: true) jQuery 1.2 新功能，设置为 false 将不会从浏览器缓存中加载请求信息。
    if(param.cache){
        param.cache = true;
    }else{
        param.cache = false;
    }

    //defaultComplete  请求完成后回调函数
    if(!param.complete || !utils.isFunction(param.complete)){
        param.complete = defaultComplete;
    }

    //contentType
    if(!param.contentType || !utils.isString(param.contentType)){
        param.contentType = 'application/x-www-form-urlencoded';
    }

    //data请求参数
    if(!param.data || !utils.isJson(param.data)){
        param.data = {};
    }
    param.data.ranCode = new Date().getTime().toString();

    //dataType  预期服务器返回的数据类型。   默认为json格式
    if(param.dataType && utils.isString(param.dataType)){
        if("xml" !=  param.dataType && "html" !=  param.dataType && "script" !=  param.dataType
            && "json" !=  param.dataType && "jsonp" !=  param.dataType ){
            alert('请求返回未知类型！' + param.dataType);
            return result;
        }
    }
    if(!param.dataType || !utils.isString(param.dataType)){
        param.dataType = "json";
    }

    // 请求失败错误处理
    if(!param.error || !utils.isFunction(param.error)){
        param.error = defaultError();
    }

    //(默认: true) 是否触发全局 AJAX 事件。设置为 false 将不会触发全局 AJAX 事件，如 ajaxStart 或 ajaxStop 。可用于控制不同的Ajax事件
    if(!param.global){
        param.global = false;
    }else{
        param.global = true;
    }

    //ifModified  (默认: false) 仅在服务器数据改变时获取新数据。使用 HTTP 包 Last-Modified 头信息判断。
    if(!param.ifModified){
        param.ifModified = false;
    }else{
        param.ifModified = true;
    }

    // processData (默认: true) 默认情况下，发送的数据将被转换为对象(技术上讲并非字符串) 以配合默认内容类型 "application/x-www-form-urlencoded"。如果要发送 DOM 树信息或其它不希望转换的信息，请设置为 false。
    if(!param.processData){
        param.processData = false;
    }else{
        param.processData = true;
    }

    // 请求失败错误处理
    if(!param.error || !utils.isFunction(param.error)){
        param.error = defaultError();
    }
}

//ajax 请求前执行
function defaultBeforeSend(){
    console.log('ajax 请求之前');
}

//complete 请求完成后回调函数 (请求成功或失败时均调用)。参数： XMLHttpRequest 对象，成功信息字符串。
function defaultComplete(XMLHttpRequest, textStatus){
    console.log('请求对象 ----------');
    console.log(XMLHttpRequest);
    console.log('请求对象 ----------');
    console.log('请求状态='+textStatus);
}

//默认错误处理
function defaultError(XMLHttpRequest, textStatus, errorThrown){
    console.log('默认错误Error处理');
}

//默认成功处理
function defaultSuccess(data, textStatus){
    console.log('默认成功Success处理');
}

//定义默认ajax 参数
function defaultAjaxParam(){
    return {
        url:null,
        data:null,
        type:'GET',
        async:true,
        beforeSend:defaultBeforeSend,
        cache:true,
        complete:defaultComplete,
        contentType:'application/x-www-form-urlencoded',
        dataType:'json',
        error:defaultError,
        global:true,
        ifModified:false,
        processData:true,
        success:defaultSuccess
    }
}