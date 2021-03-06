/*
 AngularJS v1.3.0-beta.9
 (c) 2010-2014 Google, Inc. http://angularjs.org
 License: MIT
*/
(function(r,e,s){'use strict';e.module("ngMessages",[]).directive("ngMessages",["$compile","$animate","$http","$templateCache",function(q,k,l,m){return{restrict:"AE",controller:["$scope",function(h){this.$renderNgMessageClasses=e.noop;var b=[];this.registerMessage=function(a,d){for(var c=0;c<b.length;c++)if(b[c].type==d.type){if(a!=c){var f=b[a];b[a]=b[c];a<b.length?b[c]=f:b.splice(0,c)}return}b.splice(a,0,d)};this.renderMessages=function(a,d){a=a||{};var c;e.forEach(b,function(b){c&&!d||null===a[b.type]||
!1===a[b.type]||!a[b.type]?b.detach():(b.attach(),c=!0)});this.renderElementClasses(c)}}],require:"ngMessages",link:function(h,b,a,d){d.renderElementClasses=function(a){a?k.setClass(b,"ng-active","ng-inactive"):k.setClass(b,"ng-inactive","ng-active")};var c=e.isString(a.ngMessagesMultiple)||e.isString(a.multiple),f;h.$watchCollection(a.ngMessages||a["for"],function(a){f=a;d.renderMessages(a,c)});(a=a.ngMessagesInclude||a.include)&&l.get(a,{cache:m}).success(function(a){var g;a=e.element("<div/>").html(a);
e.forEach(a.children(),function(a){a=e.element(a);g?g.after(a):b.prepend(a);g=a;q(a)(h)});d.renderMessages(f,c)})}}}]).directive("ngMessage",["$animate",function(e){return{require:"^ngMessages",transclude:"element",terminal:!0,restrict:"AE",link:function(k,l,m,h,b){for(var a,d,c=l[0],f=c.parentNode,n=0,g=0;n<f.childNodes.length;n++){var p=f.childNodes[n];if(8==p.nodeType&&0<=p.nodeValue.indexOf("ngMessage")){if(p===c){a=g;break}g++}}h.registerMessage(a,{type:m.ngMessage||m.when,attach:function(){d||
b(k,function(a){e.enter(a,null,l);d=a})},detach:function(a){d&&(e.leave(d),d=null)}})}}}])})(window,window.angular);
