(window.webpackJsonp=window.webpackJsonp||[]).push([[10],{382:function(e,t,a){"use strict";a.r(t),a.d(t,"_frontmatter",function(){return l}),a.d(t,"default",function(){return c});a(9),a(5),a(6),a(3),a(8),a(2),a(1);var n=a(104),i=a(394);function r(){return(r=Object.assign||function(e){for(var t=1;t<arguments.length;t++){var a=arguments[t];for(var n in a)Object.prototype.hasOwnProperty.call(a,n)&&(e[n]=a[n])}return e}).apply(this,arguments)}var l={},o={_frontmatter:l},b=i.a;function c(e){var t=e.components,a=function(e,t){if(null==e)return{};var a,n,i={},r=Object.keys(e);for(n=0;n<r.length;n++)a=r[n],t.indexOf(a)>=0||(i[a]=e[a]);return i}(e,["components"]);return Object(n.b)(b,r({},o,a,{components:t,mdxType:"MDXLayout"}),Object(n.b)("h3",{id:"pre-requisites"},"Pre-Requisites"),Object(n.b)("p",null,Object(n.b)("strong",{parentName:"p"},"Repository"),Object(n.b)("br",{parentName:"p"}),"\n","Navigate to ",Object(n.b)("a",r({parentName:"p"},{href:"https://github.com/IBM/FHIR"}),"https://github.com/IBM/FHIR")," "),Object(n.b)("p",null,"Open a terminal window "),Object(n.b)("p",null,"Clone to a local working directory\n",Object(n.b)("inlineCode",{parentName:"p"},"git clone git@github.com:IBM/FHIR.git")),Object(n.b)("p",null,Object(n.b)("strong",{parentName:"p"},"Maven"),Object(n.b)("br",{parentName:"p"}),"\n","You must have maven installed to create the build. ",Object(n.b)("a",r({parentName:"p"},{href:"https://maven.apache.org/"}),"https://maven.apache.org/"),"\nIt must be in the ",Object(n.b)("inlineCode",{parentName:"p"},"PATH"),"."),Object(n.b)("p",null,Object(n.b)("strong",{parentName:"p"},"Dependencies"),Object(n.b)("br",{parentName:"p"}),"\n","The ",Object(n.b)("inlineCode",{parentName:"p"},"fhir-validation")," module requires the ",Object(n.b)("inlineCode",{parentName:"p"},"fhir-examples")," be installed prior. "),Object(n.b)("pre",null,Object(n.b)("code",r({parentName:"pre"},{})," mvn clean install -f fhir-examples/ \n")),Object(n.b)("p",null,"You should see ",Object(n.b)("inlineCode",{parentName:"p"},"[INFO] BUILD SUCCESS"),", and are ready to proceed."),Object(n.b)("p",null,"This installs the examples which are part of the build. "),Object(n.b)("h3",{id:"build"},"Build"),Object(n.b)("p",null," To create the distribution, you can run the following profile. "),Object(n.b)("pre",null,Object(n.b)("code",r({parentName:"pre"},{}),"mvn clean package -f fhir-validation/ -Pfhir-validation-distribution\n")),Object(n.b)("p",null," It’ll create the following zip file - ",Object(n.b)("inlineCode",{parentName:"p"},"fhir-validation/target/fhir-validation-distribution.zip")," "),Object(n.b)("p",null,"You should see ",Object(n.b)("inlineCode",{parentName:"p"},"[INFO] BUILD SUCCESS"),", and the assembly is ready."),Object(n.b)("p",null,"This file contains: "),Object(n.b)("pre",null,Object(n.b)("code",r({parentName:"pre"},{className:"language-shell"}),"  Length      Date    Time    Name\n---------  ---------- -----   ----\n        0  10-09-2019 14:18   fhir-validation-dist/\n   302248  09-06-2019 15:58   fhir-validation-dist/antlr4-runtime-4.5.3.jar\n  6181816  10-08-2019 06:36   fhir-validation-dist/fhir-model-4.0.0-SNAPSHOT.jar\n   140564  09-06-2019 15:58   fhir-validation-dist/jakarta.json-1.1.5.jar\n    18331  10-08-2019 06:35   fhir-validation-dist/fhir-core-4.0.0-SNAPSHOT.jar\n    25058  09-11-2019 15:05   fhir-validation-dist/jakarta.annotation-api-1.3.5.jar\n 10307966  10-08-2019 06:36   fhir-validation-dist/fhir-registry-4.0.0-SNAPSHOT.jar\n   214788  09-06-2019 15:58   fhir-validation-dist/commons-io-2.6.jar\n---------                     -------\n 52769970                     13 files\n")),Object(n.b)("p",null,"FHIR® is the registered trademark of HL7 and is used with the permission of HL7."))}c.isMDXComponent=!0},392:function(e){e.exports={data:{site:{pathPrefix:"/FHIR"}}}},393:function(e){e.exports={data:{site:{siteMetadata:{repository:{baseUrl:"https://github.com/IBM/FHIR",subDirectory:"/docs"}}}}}},394:function(e,t,a){"use strict";a(34),a(23);var n=a(2),i=a(392),r=a(1),l=a.n(r),o=a(193),b=a(90),c=a.n(b),s=a(71),p=a(122),d=a(4),u=a.n(d),h=a(368),m=function(e){var t,a=e.children,i=e.title,r=e.tabs,l=void 0===r?[]:r,o=e.shouldHideHeader;return Object(n.b)("div",{className:u()((t={},t[h.pageHeader]=h.pageHeader,t[h.pageHeaderSticky]=l.length,t[h.pageHeaderShifted]=o,t))},Object(n.b)("div",{className:"bx--grid"},Object(n.b)("div",{className:"bx--row"},Object(n.b)("div",{className:"bx--col-lg-12"},Object(n.b)("h1",{id:"page-title",className:h.text},i)))),a)},j=a(393),O=a(369),f=function(e){var t=e.relativePagePath,a=e.repository,i=j.data.site.siteMetadata.repository,r=a||i,l=r.baseUrl,o=l+"/tree/master"+r.subDirectory+"/src/pages"+t;return l?Object(n.b)("div",{className:"bx--row "+O.row},Object(n.b)("div",{className:"bx--col"},Object(n.b)("a",{className:O.link,href:o},"Edit this page on GitHub"))):null},v=a(194),g=a(28),N=a(370);var y=function(e){var t,a;function i(){return e.apply(this,arguments)||this}return a=e,(t=i).prototype=Object.create(a.prototype),t.prototype.constructor=t,t.__proto__=a,i.prototype.render=function(){var e=this.props,t=e.tabs,a=e.slug,i=a.split("/").filter(Boolean).slice(-1)[0],r=t.map(function(e){var t,r=c()(e,{lower:!0}),l=r===i,o=a.replace(i,r);return Object(n.b)("li",{key:e,className:u()((t={},t[N.selectedItem]=l,t),N.listItem)},Object(n.b)(g.Link,{className:N.link,to:""+o},e))});return Object(n.b)("div",{className:N.tabsContainer},Object(n.b)("div",{className:"bx--grid"},Object(n.b)("div",{className:"bx--row"},Object(n.b)("div",{className:"bx--col-lg-12 bx--col-no-gutter"},Object(n.b)("nav",null,Object(n.b)("ul",{className:N.list},r))))))},i}(l.a.Component),H=a(195);t.a=function(e){var t=e.pageContext,a=e.children,r=e.location,l=t.frontmatter,b=void 0===l?{}:l,d=t.relativePagePath,u=b.tabs,h=b.title,j=Object(s.c)(),O=!!u&&"down"===j,g=i.data.site.pathPrefix,N=g?r.pathname.replace(g,""):r.pathname,w=u?N.split("/").slice(-1)[0]||c()(u[0],{lower:!0}):"";return Object(n.b)(p.a,{shouldHideHeader:O,homepage:!1},Object(n.b)(m,{shouldHideHeader:O,title:h,label:"label",tabs:u},u&&Object(n.b)(y,{slug:N,tabs:u,currentTab:w})),Object(n.b)(H.a,{padded:!0},a,Object(n.b)(f,{relativePagePath:d})),Object(n.b)(v.a,{pageContext:t,location:r,slug:N,tabs:u,currentTab:w}),Object(n.b)(o.a,null))}}}]);
//# sourceMappingURL=component---src-pages-guides-create-fhir-validation-assembly-md-93547a2dbc5dee54df5f.js.map