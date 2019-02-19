## :books: Exam requirements on Endpoints: :tada: :bulb:

### 1. Request Parameters:

Four types: header params, path params, query string params and request body params

In Spring: RequestHeader, PathVariable, RequestParam and RequestBody

- **_Header params:_** in request header, used for authorization mainly (tokens), browser and system information, etc.
- **_Path params:_** are part of the endpoint itself and are not optional
	example: /service/myresource/user/{user}/bicycles/{bicycleId}
- **_Query params:_** appear after a question mark (?) in the endpoint. It a query string, separateing values with & mark.
	example: /surfreport/{beachId}?days=3&units=metric&time=1400
- **_Request body params:_** most frequently used in post/put/delete methods. Mainly using some lightweight data-interchange format in the requests body, like JSON or XML.

### 2. Request header:

HTTP headers allow the client and the server to pass additional information with the request or the response.

There is 4 group of HTTP headers based on their contexts:
- **_General header:_** Headers applying to both requests and responses but with no relation to the data eventually transmitted in the body.
- **_Request header:_** Headers containing more information about the resource to be fetched or about the client itself  (tokens, browser info, etc.).
- **_Response header:_** Headers with additional information about the response, like its location or about the server itself (name and version etc.).
- **_Entity header:_** Headers containing more information about the body of the entity, like its content length or its MIME-type.

### 3. Request body:

Most HTTP requests are GET requests without bodies. Most HTTP requests with bodies use POST or PUT request method.

In REST communication this is the place where the data is transferred in XML or JSON format.

### 4. Request and Response?

The HTTP request and response is the main components of the HTTP communication between client and server.

A client sends a request and the server returns a response. Servers also can communicate with each other trough HTTP request and response.

### 5. Main status codes:

**1xx:** _Informational_
**2xx:** _Success_
**3xx:** _Redirection_
**4xx:** _Client Error_
**5xx:** _Server Error_

**100 Continue** - The server has received the request headers and the client should proceed to send the request body. </br>
**102 Processing** - A WebDAV request may contain many sub-requests involving file operations, requiring a long time to complete the request. This code indicates that the server has received and is processing the request, but no response is available yet. This prevents the client from timing out and assuming the request was lost. </br>
**200 OK** - Standard response for successful HTTP requests. </br>
**201 Created** - The request has been fulfilled, resulting in the creation of a new resource. </br>
**202 Accepted** - The request has been accepted for processing, but the processing has not been completed. </br>
**204 No Content** - The server successfully processed the request and is not returning any content. </br>
**301 Moved Permanently** - This and all future requests should be directed to the given URI. </br>
**303 See Other** - The response to the request can be found under another URI using the GET method. </br>
**401 Unauthorized** - means that the user trying to access the resource has not been authenticated or has not been authenticated correctly. </br>
**400 Bad Request** - means the HTTP request that was sent to the server has invalid syntax. </br>
**403 Forbidden** - means that the user made a valid request but the server is refusing to serve the request, due to a lack of permission to access the requested resource. </br>
**404 Not Found** - means that the user is able to communicate with the server but it is unable to locate the requested file or resource. </br>
**500 Internal Server Error** - means that server cannot process the request for an unknown reason. </br>
**502 Bad Gateway** - means that the server is a gateway or proxy server, and it is not receiving a valid response from the backend servers that should actually fulfill the request.
Example: the requested port is not open for communication. </br>
**503 Service Unavailable** - means that the server is overloaded or under maintenance. This error implies that the service should become available at some point. </br>
**504 Gateway Timeout** - means that the server is a gateway or proxy server, and it is not receiving a response from the backend servers within the allowed time period. </br>

### 6. REST, RESTful API:

Representational State Transfer

REST is also a language-independent architectural style for developing web services. An example of this arrangement is REST-based interactions all communicate their status using standard HTTP status codes. Details such as encryption and data transport integrity are solved not by adding new frameworks or technologies, but instead by relying on well-known Secure Sockets Layer (SSL) encryption and Transport Layer Security (TLS)

RESTful API = RESTful web-service

> A “web service” is a web-based application that provides resources in a format consumable by other computers. Web services include various types of APIs, including both REST and SOAP APIs. Web services are basically request-and-response interactions between clients and servers (a computer requests a resource, and the web service responds to the request).

### 7. HTTP vs HTTPS?

HTTP and HTTPS are the two protocols used to transmit data across the internet and between websites. HTTP stands for Hypertext Transfer Protocol, while the addition of the 'S' in HTTPS means it's a secure connection. Although it isn't a security provision in its own right, it indicates that the transmission of data happens securely using a Secure Socket Layer (SSL).

HTTP f you don't have an SSL certificate installed, data is transmitted in plain text, which means if it's intercepted by a hacker, they are easily able to steal and use that data without much work.

Adding an SSL certificate means these communications are secured using encryption, so even if hackers do manage to intercept the information, it’s very hard to unscramble to data into any sensical insight.

### 8. Parts of URL:

Example of URL syntax:

**scheme**://**host**:**port**/**path**?**query**1=1&**query**2=2

The main parts:

- **_Scheme:_** identifies the protocol to be used to access the resource on the Internet. It can be HTTP (without SSL) or HTTPS (with SSL).
- **_Host:_** identifies the host (domain name) that holds the resource. For example, www.example.com. A server provides services in the name of the host, but hosts and servers do not have a one-to-one mapping. May followed by a port number.
- **_Path:_** identifies the specific resource in the host that the web client wants to access. Specifies the choosen endpoint.
- **_Query:_** it follows the path component, and provides a string of information that the resource can use for some purpose (parameters for a search or as data to be processed). The query string is usually a string of name and value pairs; for example, term=bluebird. Name and value pairs are separated from each other by an ampersand (&)

### Expected skills (4/5)

#### Able to explain HTTP request communication flow:

In client-server protocols, like HTTP, sessions consist of three phases:
- The client establishes a TCP connection (or the appropriate connection if the transport layer is not TCP).
- The client sends its request, and waits for the answer.
- The server processes the request, sending back its answer, providing a status code and appropriate data.

As of HTTP/1.1, the connection is no longer closed after completing the third phase, and the client is now granted a further request: this means the second and third phases can now be performed any number of times.

#### Able to demonstrate how to create an HTTP request:

We can create requests in multiple ways. We can write code to send request or use any tool which provides such option like Postman or some online tool for basic get/post reuests [codepunker](https://www.codepunker.com/tools/http-requests)

#### Able to recognize a REST endpoint:

The endpoint returns an object, not a html file. The response body conaints the object in JSON or XML format.

#### Able to send or receive data either in body or in URL params:

Just show and endpoint with @Requestbody, @Requestpara or @PathVariable to demonstrate receiving data.
Any type of REST endpoint returns data in the response body, explain it. We can create a request with postman containing data in the body or in the url.

#### Able recognize the status for the http request (success / failure):

Check the 5. point above.
