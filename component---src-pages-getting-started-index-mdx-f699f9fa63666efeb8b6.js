(window.webpackJsonp=window.webpackJsonp||[]).push([[8],{"013z":function(e,t,a){"use strict";a("HQhv"),a("sC2a");var r=a("qKvR"),n=a("pOBw"),o=a("q1tI"),i=a.n(o),c=a("huSw"),s=a("t0dz"),b=a.n(s),l=a("Bfmn"),p=a("a7k6"),d=a("TSYQ"),u=a.n(d),v=a("QH2O"),O=function(e){var t,a=e.children,n=e.title,o=e.tabs,i=void 0===o?[]:o,c=e.shouldHideHeader;return Object(r.b)("div",{className:u()((t={},t[v.pageHeader]=v.pageHeader,t[v.pageHeaderSticky]=i.length,t[v.pageHeaderShifted]=c,t))},Object(r.b)("div",{className:"bx--grid"},Object(r.b)("div",{className:"bx--row"},Object(r.b)("div",{className:"bx--col-lg-12"},Object(r.b)("h1",{id:"page-title",className:v.text},n)))),a)},m=a("Z3H1"),f=a("BAC9"),j=function(e){var t=e.relativePagePath,a=e.repository,n=m.data.site.siteMetadata.repository,o=a||n,i=o.baseUrl,c=i+"/tree/master"+o.subDirectory+"/src/pages"+t;return i?Object(r.b)("div",{className:"bx--row "+f.row},Object(r.b)("div",{className:"bx--col"},Object(r.b)("a",{className:f.link,href:c},"Edit this page on GitHub"))):null},g=a("FCXl"),h=a("Wbzz"),x=a("I8xM");var y=function(e){var t,a;function n(){return e.apply(this,arguments)||this}return a=e,(t=n).prototype=Object.create(a.prototype),t.prototype.constructor=t,t.__proto__=a,n.prototype.render=function(){var e=this.props,t=e.tabs,a=e.slug,n=a.split("/").filter(Boolean).slice(-1)[0],o=t.map((function(e){var t,o=b()(e,{lower:!0}),i=o===n,c=a.replace(n,o);return Object(r.b)("li",{key:e,className:u()((t={},t[x.selectedItem]=i,t),x.listItem)},Object(r.b)(h.Link,{className:x.link,to:""+c},e))}));return Object(r.b)("div",{className:x.tabsContainer},Object(r.b)("div",{className:"bx--grid"},Object(r.b)("div",{className:"bx--row"},Object(r.b)("div",{className:"bx--col-lg-12 bx--col-no-gutter"},Object(r.b)("nav",null,Object(r.b)("ul",{className:x.list},o))))))},n}(i.a.Component),w=a("MjG9");t.a=function(e){var t=e.pageContext,a=e.children,o=e.location,i=t.frontmatter,s=void 0===i?{}:i,d=t.relativePagePath,u=s.tabs,v=s.title,m=Object(l.c)(),f=!!u&&"down"===m,h=n.data.site.pathPrefix,x=h?o.pathname.replace(h,""):o.pathname,H=u?x.split("/").slice(-1)[0]||b()(u[0],{lower:!0}):"";return Object(r.b)(p.a,{shouldHideHeader:f,homepage:!1},Object(r.b)(O,{shouldHideHeader:f,title:v,label:"label",tabs:u},u&&Object(r.b)(y,{slug:x,tabs:u,currentTab:H})),Object(r.b)(w.a,{padded:!0},a,Object(r.b)(j,{relativePagePath:d})),Object(r.b)(g.a,{pageContext:t,location:o,slug:x,tabs:u,currentTab:H}),Object(r.b)(c.a,null))}},Uxid:function(e,t,a){"use strict";a.r(t),a.d(t,"_frontmatter",(function(){return c})),a.d(t,"default",(function(){return p}));a("E5k/"),a("rzGZ"),a("Dq+y"),a("8npG"),a("Ggvi"),a("qKvR"),a("q1tI");var r=a("E/Ix"),n=a("013z");function o(){return(o=Object.assign||function(e){for(var t=1;t<arguments.length;t++){var a=arguments[t];for(var r in a)Object.prototype.hasOwnProperty.call(a,r)&&(e[r]=a[r])}return e}).apply(this,arguments)}var i,c={},s=(i="PageDescription",function(e){return console.warn("Component "+i+" was not imported, exported, or provided by MDXProvider as global scope"),Object(r.b)("div",e)}),b={_frontmatter:c},l=n.a;function p(e){var t=e.components,a=function(e,t){if(null==e)return{};var a,r,n={},o=Object.keys(e);for(r=0;r<o.length;r++)a=o[r],t.indexOf(a)>=0||(n[a]=e[a]);return n}(e,["components"]);return Object(r.b)(l,o({},b,a,{components:t,mdxType:"MDXLayout"}),Object(r.b)(s,{mdxType:"PageDescription"},"Gettting Started"))}p.isMDXComponent=!0},Z3H1:function(e){e.exports=JSON.parse('{"data":{"site":{"siteMetadata":{"repository":{"baseUrl":"https://github.com/IBM/FHIR","subDirectory":"/docs"}}}}}')},pOBw:function(e){e.exports=JSON.parse('{"data":{"site":{"pathPrefix":"/FHIR"}}}')}}]);
//# sourceMappingURL=component---src-pages-getting-started-index-mdx-f699f9fa63666efeb8b6.js.map