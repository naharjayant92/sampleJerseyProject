This is the sample project to reproduce issue I'm getting for Chinese character on Weblogic server. The characters in the request are getting corrupted before hitting the end point.

I have used below list of jar files to run this project-

hk2-api-2.5.0-b32.jar

hk2-locator-2.5.0-b32.jar

hk2-utils-2.5.0-b32.jar

jackson-annotations-2.13.4.jar

jackson-core-2.13.4.jar

jackson-databind-2.13.4.2.jar

jackson-jaxrs-base-2.13.4.jar

jackson-jaxrs-json-provider-2.13.4.jar

jackson-module-jaxb-annotations-2.13.4.jar

javax.annotation-api-1.3.jar

javax.servlet-api-3.0.1.jar

javax.ws.rs-api-2.0.1.jar

jaxrs-ri-2.25.1.jar

jersey-client.jar

jersey-common.jar

jersey-container-servlet-core.jar

jersey-entity-filtering-2.25.1.jar

jersey-guava-2.25.1.jar

jersey-media-jaxb.jar

jersey-media-json-jackson-2.25.1.jar

jersey-media-multipart-2.25.1.jar

jersey-server.jar

mimepull-1.9.6.jar

Sample URL: http://localhost:7001/jersey2/rest/message/testPost

Webserver used: Weblogic

Sample input of failing request :

{

"body": {

"inputs": [

    {

      "propertyValues": [
        {

        "name": "chineseChar",

        "values": [

              "提交应标"

          ]

        }

      ]

    }

    ]

  }

}

Expected Response: Hello World æ��äº¤åº”æ ‡

Actual Response: Hello World 提交应标

In my actual project, the request is failing with below error-

Invalid UTF-8 middle byte 0x3f at [Source: (org.glassfish.jersey.message.internal.ReaderInterceptorExecutor$UnCloseableInputStream); line: 1, column: 442] (through reference chain: .....)

Though I couldn't simulate exact issue but I'm pretty sure, that's because of this corrupted string.
