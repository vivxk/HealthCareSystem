{
    "swagger": "2.0",
    "info": {
        "description": "Api Documentation",
        "version": "1.0",
        "title": "Api Documentation",
        "termsOfService": "urn:tos",
        "contact": {},
        "license": {
            "name": "Apache 2.0",
            "url": "http://www.apache.org/licenses/LICENSE-2.0"
        }
    },
    "host": "localhost:8099",
    "basePath": "/",
    "tags": [
        {
            "name": "admin-controller",
            "description": "Admin Controller"
        },
        {
            "name": "appointment-controller",
            "description": "Appointment Controller"
        },
        {
            "name": "basic-error-controller",
            "description": "Basic Error Controller"
        },
        {
            "name": "diagnostic-center-controller",
            "description": "Diagnostic Center Controller"
        },
        {
            "name": "diagnostic-test-controller",
            "description": "Diagnostic Test Controller"
        },
        {
            "name": "login-controller",
            "description": "Login Controller"
        },
        {
            "name": "patient-controller",
            "description": "Patient Controller"
        },
        {
            "name": "test-controller",
            "description": "Test Controller"
        },
        {
            "name": "test-result-controller",
            "description": "Test Result Controller"
        },
        {
            "name": "user-controller",
            "description": "User Controller"
        }
    ],
    "paths": {
        "/Appointment/addTestRes/{AppointmentId}/{testResId}": {
            "put": {
                "tags": [
                    "appointment-controller"
                ],
                "summary": "addTestRes",
                "operationId": "addTestResUsingPUT",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "AppointmentId",
                        "in": "path",
                        "description": "AppointmentId",
                        "required": true,
                        "type": "integer",
                        "format": "int32"
                    },
                    {
                        "name": "testResId",
                        "in": "path",
                        "description": "testResId",
                        "required": true,
                        "type": "integer",
                        "format": "int32"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/TestResult"
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/Appointment/addappointment": {
            "post": {
                "tags": [
                    "appointment-controller"
                ],
                "summary": "addAppointment",
                "operationId": "addAppointmentUsingPOST",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "appointment",
                        "description": "appointment",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/AppointmentReq"
                        }
                    },
                    {
                        "name": "diagnosticCenterID",
                        "in": "query",
                        "description": "diagnosticCenterID",
                        "required": true,
                        "type": "string"
                    },
                    {
                        "name": "patientID",
                        "in": "query",
                        "description": "patientID",
                        "required": true,
                        "type": "string"
                    },
                    {
                        "name": "testIds",
                        "in": "query",
                        "description": "testIds",
                        "required": true,
                        "type": "integer",
                        "format": "int32"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/AppointmentRes"
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/Appointment/getAll": {
            "get": {
                "tags": [
                    "appointment-controller"
                ],
                "summary": "getAll",
                "operationId": "getAllUsingGET",
                "produces": [
                    "*/*"
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "type": "array",
                            "items": {
                                "$ref": "#/definitions/AppointmentRes"
                            }
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/Appointment/getPatient/{AppointmentId}": {
            "get": {
                "tags": [
                    "appointment-controller"
                ],
                "summary": "getPatient",
                "operationId": "getPatientUsingGET",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "appID",
                        "in": "path",
                        "description": "appID",
                        "required": true,
                        "type": "integer",
                        "format": "int32"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/Patient"
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/Appointment/getVerifiable": {
            "get": {
                "tags": [
                    "appointment-controller"
                ],
                "summary": "verifiable",
                "operationId": "verifiableUsingGET",
                "produces": [
                    "*/*"
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "type": "array",
                            "items": {
                                "$ref": "#/definitions/AppointmentRes"
                            }
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/Appointment/getWithNoTestResults": {
            "get": {
                "tags": [
                    "appointment-controller"
                ],
                "summary": "noTestResults",
                "operationId": "noTestResultsUsingGET",
                "produces": [
                    "*/*"
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "type": "array",
                            "items": {
                                "$ref": "#/definitions/AppointmentRes"
                            }
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/Appointment/getappointmentlist": {
            "get": {
                "tags": [
                    "appointment-controller"
                ],
                "summary": "getApppointmentList",
                "operationId": "getApppointmentListUsingGET",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "appointmentStatus",
                        "in": "query",
                        "description": "appointmentStatus",
                        "required": true,
                        "type": "string"
                    },
                    {
                        "name": "diagnosticCenterid",
                        "in": "query",
                        "description": "diagnosticCenterid",
                        "required": true,
                        "type": "string"
                    },
                    {
                        "name": "testName",
                        "in": "query",
                        "description": "testName",
                        "required": true,
                        "type": "string"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "type": "array",
                            "items": {
                                "$ref": "#/definitions/AppointmentRes"
                            }
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/Appointment/reject": {
            "put": {
                "tags": [
                    "appointment-controller"
                ],
                "summary": "reject",
                "operationId": "rejectUsingPUT",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "appointment",
                        "description": "appointment",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/AppointmentReq"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/AppointmentRes"
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/Appointment/removeappointment": {
            "delete": {
                "tags": [
                    "appointment-controller"
                ],
                "summary": "removeAppointment",
                "operationId": "removeAppointmentUsingDELETE",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "appointment",
                        "description": "appointment",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/AppointmentReq"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/AppointmentRes"
                        }
                    },
                    "204": {
                        "description": "No Content"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    }
                }
            }
        },
        "/Appointment/updateappointment": {
            "put": {
                "tags": [
                    "appointment-controller"
                ],
                "summary": "updateAppointment",
                "operationId": "updateAppointmentUsingPUT",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "appointment",
                        "description": "appointment",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/AppointmentReq"
                        }
                    },
                    {
                        "name": "diagnosticCenterID",
                        "in": "query",
                        "description": "diagnosticCenterID",
                        "required": false,
                        "type": "string"
                    },
                    {
                        "name": "patientID",
                        "in": "query",
                        "description": "patientID",
                        "required": false,
                        "type": "string"
                    },
                    {
                        "name": "testIds",
                        "in": "query",
                        "description": "testIds",
                        "required": false,
                        "type": "integer",
                        "format": "int32"
                    },
                    {
                        "name": "testResultId",
                        "in": "query",
                        "description": "testResultId",
                        "required": false,
                        "type": "integer",
                        "format": "int32"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/AppointmentRes"
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/Appointment/verify": {
            "put": {
                "tags": [
                    "appointment-controller"
                ],
                "summary": "verify",
                "operationId": "verifyUsingPUT",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "appointment",
                        "description": "appointment",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/AppointmentReq"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/AppointmentRes"
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/Appointment/viewappointment/{appointmentId}": {
            "get": {
                "tags": [
                    "appointment-controller"
                ],
                "summary": "viewAppointment",
                "operationId": "viewAppointmentUsingGET",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "appointmentId",
                        "in": "path",
                        "description": "appointmentId",
                        "required": true,
                        "type": "integer",
                        "format": "int32"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/AppointmentRes"
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/Appointment/viewappointments/{patientId}": {
            "get": {
                "tags": [
                    "appointment-controller"
                ],
                "summary": "viewAppointments",
                "operationId": "viewAppointmentsUsingGET",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "patientId",
                        "in": "path",
                        "description": "patientId",
                        "required": true,
                        "type": "integer",
                        "format": "int32"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "type": "array",
                            "items": {
                                "$ref": "#/definitions/AppointmentRes"
                            }
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/DiagnosticCenter/addDiagnosticCenter": {
            "post": {
                "tags": [
                    "diagnostic-center-controller"
                ],
                "summary": "addDiagnosticCenter",
                "operationId": "addDiagnosticCenterUsingPOST",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "diagnosticCenter",
                        "description": "diagnosticCenter",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/DiagnosticCenterReq"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/DiagnosticCenterRes"
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/DiagnosticCenter/addTest/{diagnosticcenterId}/{testid}": {
            "post": {
                "tags": [
                    "diagnostic-center-controller"
                ],
                "summary": "addTest",
                "operationId": "addTestUsingPOST",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "diagnosticCenterId",
                        "in": "path",
                        "description": "diagnosticCenterId",
                        "required": true,
                        "type": "integer",
                        "format": "int32"
                    },
                    {
                        "name": "testid",
                        "in": "path",
                        "description": "testid",
                        "required": true,
                        "type": "integer",
                        "format": "int32"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/DiagnosticTest"
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/DiagnosticCenter/appointments/{centerName}": {
            "get": {
                "tags": [
                    "diagnostic-center-controller"
                ],
                "summary": "getListOfAppointments",
                "operationId": "getListOfAppointmentsUsingGET",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "centerName",
                        "in": "path",
                        "description": "centerName",
                        "required": true,
                        "type": "string"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "type": "array",
                            "items": {
                                "$ref": "#/definitions/Appointment"
                            }
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/DiagnosticCenter/getDiagnosticCenter/{centername}": {
            "get": {
                "tags": [
                    "diagnostic-center-controller"
                ],
                "summary": "getDiagnosticCenter",
                "operationId": "getDiagnosticCenterUsingGET",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "centername",
                        "in": "path",
                        "description": "centername",
                        "required": true,
                        "type": "string"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/DiagnosticCenterRes"
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/DiagnosticCenter/getDiagnosticCenter/{diagnosticCenterId}": {
            "get": {
                "tags": [
                    "diagnostic-center-controller"
                ],
                "summary": "getDiagnosticCenterById",
                "operationId": "getDiagnosticCenterByIdUsingGET",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "diagnosticCenterId",
                        "in": "path",
                        "description": "diagnosticCenterId",
                        "required": true,
                        "type": "integer",
                        "format": "int32"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/DiagnosticCenterRes"
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/DiagnosticCenter/getDiagnosticCenters": {
            "get": {
                "tags": [
                    "diagnostic-center-controller"
                ],
                "summary": "getAllDiagnosticCenters",
                "operationId": "getAllDiagnosticCentersUsingGET",
                "produces": [
                    "*/*"
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "type": "array",
                            "items": {
                                "$ref": "#/definitions/DiagnosticCenterRes"
                            }
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/DiagnosticCenter/removeDiagnosticCenter/{id}": {
            "delete": {
                "tags": [
                    "diagnostic-center-controller"
                ],
                "summary": "removeDiagnosticCenter",
                "operationId": "removeDiagnosticCenterUsingDELETE",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "id",
                        "in": "path",
                        "description": "id",
                        "required": true,
                        "type": "integer",
                        "format": "int32"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/DiagnosticCenterRes"
                        }
                    },
                    "204": {
                        "description": "No Content"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    }
                }
            }
        },
        "/DiagnosticCenter/updateDiagnosticcenter/{diagnosticCenterid}": {
            "put": {
                "tags": [
                    "diagnostic-center-controller"
                ],
                "summary": "updateDiagnosticCenter",
                "operationId": "updateDiagnosticCenterUsingPUT",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "diagnosticCenter",
                        "description": "diagnosticCenter",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/DiagnosticCenterReq"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/DiagnosticCenterRes"
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/DiagnosticCenter/viewTestDetail{diagnosticCenterId}": {
            "get": {
                "tags": [
                    "diagnostic-center-controller"
                ],
                "summary": "viewTestDetails",
                "operationId": "viewTestDetailsUsingGET",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "diagnosticCenterId",
                        "in": "path",
                        "description": "diagnosticCenterId",
                        "required": true,
                        "type": "integer",
                        "format": "int32"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "type": "array",
                            "items": {
                                "$ref": "#/definitions/DiagnosticTest"
                            }
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/DiagnosticTest/addNewTest": {
            "post": {
                "tags": [
                    "diagnostic-test-controller"
                ],
                "summary": "addNewTest",
                "operationId": "addNewTestUsingPOST",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "test",
                        "description": "test",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/DiagnosticTest"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/DiagnosticTest"
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/DiagnosticTest/getAllTests": {
            "get": {
                "tags": [
                    "diagnostic-test-controller"
                ],
                "summary": "getAllTest",
                "operationId": "getAllTestUsingGET",
                "produces": [
                    "*/*"
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "type": "array",
                            "items": {
                                "$ref": "#/definitions/DiagnosticTest"
                            }
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/DiagnosticTest/getTestById/{diagnosticTestid}": {
            "get": {
                "tags": [
                    "diagnostic-test-controller"
                ],
                "summary": "getTestById",
                "operationId": "getTestByIdUsingGET",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "diagnosticTestid",
                        "in": "path",
                        "description": "diagnosticTestid",
                        "required": true,
                        "type": "integer",
                        "format": "int32"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/DiagnosticTest"
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/DiagnosticTest/getTestofDiagnosticCenter/{centerId}": {
            "get": {
                "tags": [
                    "diagnostic-test-controller"
                ],
                "summary": "getTestsOfDiagnosticCenter",
                "operationId": "getTestsOfDiagnosticCenterUsingGET",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "centerId",
                        "in": "path",
                        "description": "centerId",
                        "required": true,
                        "type": "integer",
                        "format": "int32"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "type": "array",
                            "items": {
                                "$ref": "#/definitions/DiagnosticTest"
                            }
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/DiagnosticTest/removeTest/{centerId}/{test}": {
            "delete": {
                "tags": [
                    "diagnostic-test-controller"
                ],
                "summary": "removeTestFromDiagnosticCenter",
                "operationId": "removeTestFromDiagnosticCenterUsingDELETE",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "centerId",
                        "in": "path",
                        "description": "centerId",
                        "required": true,
                        "type": "integer",
                        "format": "int32"
                    },
                    {
                        "name": "test",
                        "in": "path",
                        "description": "test",
                        "required": true,
                        "type": "integer",
                        "format": "int32"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/DiagnosticTest"
                        }
                    },
                    "204": {
                        "description": "No Content"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    }
                }
            }
        },
        "/DiagnosticTest/updateTestDetail": {
            "put": {
                "tags": [
                    "diagnostic-test-controller"
                ],
                "summary": "updateTestDetail",
                "operationId": "updateTestDetailUsingPUT",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "test",
                        "description": "test",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/DiagnosticTest"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/DiagnosticTest"
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/Login": {
            "post": {
                "tags": [
                    "login-controller"
                ],
                "summary": "loginUser",
                "operationId": "loginUserUsingPOST",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "user",
                        "description": "user",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/User"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/User"
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/Logout": {
            "post": {
                "tags": [
                    "login-controller"
                ],
                "summary": "logOut",
                "operationId": "logOutUsingPOST",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "user",
                        "description": "user",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/User"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/User"
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/TestResult/RemoveTest/{id}": {
            "delete": {
                "tags": [
                    "test-controller"
                ],
                "summary": "removeTest",
                "operationId": "removeTestUsingDELETE",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "ts",
                        "in": "path",
                        "description": "ts",
                        "required": true,
                        "type": "string"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "type": "string"
                        }
                    },
                    "204": {
                        "description": "No Content"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    }
                }
            }
        },
        "/TestResult/UpdateTest": {
            "put": {
                "tags": [
                    "test-controller"
                ],
                "summary": "updateTest",
                "operationId": "updateTestUsingPUT",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "ts",
                        "description": "ts",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/DiagnosticTest"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/DiagnosticTest"
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/TestResult/ViewAllTest": {
            "get": {
                "tags": [
                    "test-controller"
                ],
                "summary": "viewAllTest",
                "operationId": "viewAllTestUsingGET",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "criteria",
                        "in": "path",
                        "description": "criteria",
                        "required": true,
                        "type": "string"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "type": "array",
                            "items": {
                                "$ref": "#/definitions/DiagnosticTest"
                            }
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/TestResult/addTest": {
            "post": {
                "tags": [
                    "test-controller"
                ],
                "summary": "addTest",
                "operationId": "addTestUsingPOST_1",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "ts",
                        "description": "ts",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/DiagnosticTest"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/DiagnosticTest"
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/admin/deleteAdmin/{id}": {
            "delete": {
                "tags": [
                    "admin-controller"
                ],
                "summary": "deleteAdmin",
                "operationId": "deleteAdminUsingDELETE",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "id",
                        "in": "path",
                        "description": "id",
                        "required": true,
                        "type": "integer",
                        "format": "int32"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/User"
                        }
                    },
                    "204": {
                        "description": "No Content"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    }
                }
            }
        },
        "/admin/registeradmin": {
            "post": {
                "tags": [
                    "admin-controller"
                ],
                "summary": "registerAdmin",
                "operationId": "registerAdminUsingPOST",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "user",
                        "description": "user",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/User"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "type": "string",
                            "enum": [
                                "ACCEPTED",
                                "ALREADY_REPORTED",
                                "BAD_GATEWAY",
                                "BAD_REQUEST",
                                "BANDWIDTH_LIMIT_EXCEEDED",
                                "CHECKPOINT",
                                "CONFLICT",
                                "CONTINUE",
                                "CREATED",
                                "DESTINATION_LOCKED",
                                "EXPECTATION_FAILED",
                                "FAILED_DEPENDENCY",
                                "FORBIDDEN",
                                "FOUND",
                                "GATEWAY_TIMEOUT",
                                "GONE",
                                "HTTP_VERSION_NOT_SUPPORTED",
                                "IM_USED",
                                "INSUFFICIENT_SPACE_ON_RESOURCE",
                                "INSUFFICIENT_STORAGE",
                                "INTERNAL_SERVER_ERROR",
                                "I_AM_A_TEAPOT",
                                "LENGTH_REQUIRED",
                                "LOCKED",
                                "LOOP_DETECTED",
                                "METHOD_FAILURE",
                                "METHOD_NOT_ALLOWED",
                                "MOVED_PERMANENTLY",
                                "MOVED_TEMPORARILY",
                                "MULTIPLE_CHOICES",
                                "MULTI_STATUS",
                                "NETWORK_AUTHENTICATION_REQUIRED",
                                "NON_AUTHORITATIVE_INFORMATION",
                                "NOT_ACCEPTABLE",
                                "NOT_EXTENDED",
                                "NOT_FOUND",
                                "NOT_IMPLEMENTED",
                                "NOT_MODIFIED",
                                "NO_CONTENT",
                                "OK",
                                "PARTIAL_CONTENT",
                                "PAYLOAD_TOO_LARGE",
                                "PAYMENT_REQUIRED",
                                "PERMANENT_REDIRECT",
                                "PRECONDITION_FAILED",
                                "PRECONDITION_REQUIRED",
                                "PROCESSING",
                                "PROXY_AUTHENTICATION_REQUIRED",
                                "REQUESTED_RANGE_NOT_SATISFIABLE",
                                "REQUEST_ENTITY_TOO_LARGE",
                                "REQUEST_HEADER_FIELDS_TOO_LARGE",
                                "REQUEST_TIMEOUT",
                                "REQUEST_URI_TOO_LONG",
                                "RESET_CONTENT",
                                "SEE_OTHER",
                                "SERVICE_UNAVAILABLE",
                                "SWITCHING_PROTOCOLS",
                                "TEMPORARY_REDIRECT",
                                "TOO_EARLY",
                                "TOO_MANY_REQUESTS",
                                "UNAUTHORIZED",
                                "UNAVAILABLE_FOR_LEGAL_REASONS",
                                "UNPROCESSABLE_ENTITY",
                                "UNSUPPORTED_MEDIA_TYPE",
                                "UPGRADE_REQUIRED",
                                "URI_TOO_LONG",
                                "USE_PROXY",
                                "VARIANT_ALSO_NEGOTIATES"
                            ]
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/admin/updateAdmin": {
            "put": {
                "tags": [
                    "admin-controller"
                ],
                "summary": "updateAdmin",
                "operationId": "updateAdminUsingPUT",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "user",
                        "description": "user",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/User"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/User"
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/error": {
            "get": {
                "tags": [
                    "basic-error-controller"
                ],
                "summary": "errorHtml",
                "operationId": "errorHtmlUsingGET",
                "produces": [
                    "text/html"
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/ModelAndView"
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            },
            "head": {
                "tags": [
                    "basic-error-controller"
                ],
                "summary": "errorHtml",
                "operationId": "errorHtmlUsingHEAD",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "text/html"
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/ModelAndView"
                        }
                    },
                    "204": {
                        "description": "No Content"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    }
                }
            },
            "post": {
                "tags": [
                    "basic-error-controller"
                ],
                "summary": "errorHtml",
                "operationId": "errorHtmlUsingPOST",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "text/html"
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/ModelAndView"
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            },
            "put": {
                "tags": [
                    "basic-error-controller"
                ],
                "summary": "errorHtml",
                "operationId": "errorHtmlUsingPUT",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "text/html"
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/ModelAndView"
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            },
            "delete": {
                "tags": [
                    "basic-error-controller"
                ],
                "summary": "errorHtml",
                "operationId": "errorHtmlUsingDELETE",
                "produces": [
                    "text/html"
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/ModelAndView"
                        }
                    },
                    "204": {
                        "description": "No Content"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    }
                }
            },
            "options": {
                "tags": [
                    "basic-error-controller"
                ],
                "summary": "errorHtml",
                "operationId": "errorHtmlUsingOPTIONS",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "text/html"
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/ModelAndView"
                        }
                    },
                    "204": {
                        "description": "No Content"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    }
                }
            },
            "patch": {
                "tags": [
                    "basic-error-controller"
                ],
                "summary": "errorHtml",
                "operationId": "errorHtmlUsingPATCH",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "text/html"
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/ModelAndView"
                        }
                    },
                    "204": {
                        "description": "No Content"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    }
                }
            }
        },
        "/patient/deletePatient": {
            "delete": {
                "tags": [
                    "patient-controller"
                ],
                "summary": "deletePatient",
                "operationId": "deletePatientUsingDELETE",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "patient",
                        "description": "patient",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/PatientReq"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/PatientRes"
                        }
                    },
                    "204": {
                        "description": "No Content"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    }
                }
            }
        },
        "/patient/getAll": {
            "get": {
                "tags": [
                    "patient-controller"
                ],
                "summary": "getAll",
                "operationId": "getAllUsingGET_1",
                "produces": [
                    "*/*"
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "type": "array",
                            "items": {
                                "$ref": "#/definitions/PatientRes"
                            }
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/patient/registerpatient": {
            "post": {
                "tags": [
                    "patient-controller"
                ],
                "summary": "registerPatient",
                "operationId": "registerPatientUsingPOST",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "patient",
                        "description": "patient",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/PatientReq"
                        }
                    },
                    {
                        "name": "userID",
                        "in": "path",
                        "description": "userID",
                        "required": true,
                        "type": "integer",
                        "format": "int32"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/PatientRes"
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/patient/updatepatient": {
            "put": {
                "tags": [
                    "patient-controller"
                ],
                "summary": "updatePatientDetails",
                "operationId": "updatePatientDetailsUsingPUT",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "patient",
                        "description": "patient",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/PatientReq"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/PatientRes"
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/patient/viewpatient/{userid}": {
            "get": {
                "tags": [
                    "patient-controller"
                ],
                "summary": "viewPatient",
                "operationId": "viewPatientUsingGET",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "userid",
                        "in": "path",
                        "description": "userid",
                        "required": true,
                        "type": "string"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/PatientRes"
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/patient/viewtestresult/{testResultId}": {
            "get": {
                "tags": [
                    "patient-controller"
                ],
                "summary": "viewTestResult",
                "operationId": "viewTestResultUsingGET",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "testResultId",
                        "in": "path",
                        "description": "testResultId",
                        "required": true,
                        "type": "integer",
                        "format": "int32"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/TestResult"
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/testresult/addresult": {
            "post": {
                "tags": [
                    "test-result-controller"
                ],
                "summary": "addTestResult",
                "operationId": "addTestResultUsingPOST",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "tr",
                        "description": "tr",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/TestResult"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/TestResult"
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/testresult/getAllTestResults": {
            "get": {
                "tags": [
                    "test-result-controller"
                ],
                "summary": "getAllTestResults",
                "operationId": "getAllTestResultsUsingGET",
                "produces": [
                    "*/*"
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "type": "array",
                            "items": {
                                "$ref": "#/definitions/TestResult"
                            }
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/testresult/removeresult/{id}": {
            "delete": {
                "tags": [
                    "test-result-controller"
                ],
                "summary": "removeTestResult",
                "operationId": "removeTestResultUsingDELETE",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "id",
                        "in": "path",
                        "description": "id",
                        "required": true,
                        "type": "integer",
                        "format": "int32"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "type": "array",
                            "items": {
                                "$ref": "#/definitions/TestResult"
                            }
                        }
                    },
                    "204": {
                        "description": "No Content"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    }
                }
            }
        },
        "/testresult/resultbyid/{id}": {
            "get": {
                "tags": [
                    "test-result-controller"
                ],
                "summary": "getById",
                "operationId": "getByIdUsingGET",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "id",
                        "in": "path",
                        "description": "id",
                        "required": true,
                        "type": "integer",
                        "format": "int32"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/TestResult"
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/testresult/updateresult": {
            "put": {
                "tags": [
                    "test-result-controller"
                ],
                "summary": "updateResult",
                "operationId": "updateResultUsingPUT",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "tr",
                        "description": "tr",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/TestResult"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/TestResult"
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/testresult/viewresultsbypatient/{patientID}": {
            "get": {
                "tags": [
                    "test-result-controller"
                ],
                "summary": "viewResultsByPatient",
                "operationId": "viewResultsByPatientUsingGET",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "name": "patientID",
                        "in": "path",
                        "description": "patientID",
                        "required": true,
                        "type": "integer",
                        "format": "int32"
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "type": "array",
                            "items": {
                                "$ref": "#/definitions/TestResult"
                            }
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/user/addUser": {
            "post": {
                "tags": [
                    "user-controller"
                ],
                "summary": "addUser",
                "operationId": "addUserUsingPOST",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "user",
                        "description": "user",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/User"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/User"
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/user/getAll": {
            "get": {
                "tags": [
                    "user-controller"
                ],
                "summary": "getAll",
                "operationId": "getAllUsingGET_2",
                "produces": [
                    "*/*"
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "type": "array",
                            "items": {
                                "$ref": "#/definitions/User"
                            }
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/user/removeUser": {
            "delete": {
                "tags": [
                    "user-controller"
                ],
                "summary": "removeUser",
                "operationId": "removeUserUsingDELETE",
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "user",
                        "description": "user",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/User"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/User"
                        }
                    },
                    "204": {
                        "description": "No Content"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    }
                }
            }
        },
        "/user/updateUser": {
            "put": {
                "tags": [
                    "user-controller"
                ],
                "summary": "updateUser",
                "operationId": "updateUserUsingPUT",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "user",
                        "description": "user",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/User"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/User"
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        },
        "/user/validateUser": {
            "post": {
                "tags": [
                    "user-controller"
                ],
                "summary": "validateUser",
                "operationId": "validateUserUsingPOST",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "user",
                        "description": "user",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/User"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/User"
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        }
    },
    "definitions": {
        "Appointment": {
            "type": "object",
            "properties": {
                "appointmentDate": {
                    "type": "string",
                    "format": "date"
                },
                "appointmentid": {
                    "type": "integer",
                    "format": "int32"
                },
                "approvalStatus": {
                    "type": "string",
                    "enum": [
                        "approved",
                        "cancelled",
                        "statutsnotapproved"
                    ]
                },
                "diagnosticCenter": {
                    "$ref": "#/definitions/DiagnosticCenter"
                },
                "diagnosticTests": {
                    "type": "array",
                    "uniqueItems": true,
                    "items": {
                        "$ref": "#/definitions/DiagnosticTest"
                    }
                },
                "testResult": {
                    "type": "array",
                    "uniqueItems": true,
                    "items": {
                        "$ref": "#/definitions/TestResult"
                    }
                }
            },
            "title": "Appointment"
        },
        "AppointmentReq": {
            "type": "object",
            "properties": {
                "appointmentDate": {
                    "type": "string",
                    "format": "date"
                },
                "appointmentid": {
                    "type": "integer",
                    "format": "int32"
                },
                "approvalStatus": {
                    "type": "string",
                    "enum": [
                        "approved",
                        "cancelled",
                        "statutsnotapproved"
                    ]
                }
            },
            "title": "AppointmentReq"
        },
        "AppointmentRes": {
            "type": "object",
            "properties": {
                "appointmentDate": {
                    "type": "string",
                    "format": "date"
                },
                "appointmentid": {
                    "type": "integer",
                    "format": "int32"
                },
                "approvalStatus": {
                    "type": "string",
                    "enum": [
                        "approved",
                        "cancelled",
                        "statutsnotapproved"
                    ]
                },
                "diagnosticCenter": {
                    "$ref": "#/definitions/DiagnosticCenter"
                },
                "diagnosticTests": {
                    "type": "array",
                    "uniqueItems": true,
                    "items": {
                        "$ref": "#/definitions/DiagnosticTest"
                    }
                },
                "testResult": {
                    "type": "array",
                    "uniqueItems": true,
                    "items": {
                        "$ref": "#/definitions/TestResult"
                    }
                }
            },
            "title": "AppointmentRes"
        },
        "DiagnosticCenter": {
            "type": "object",
            "properties": {
                "address": {
                    "type": "string"
                },
                "contactEmail": {
                    "type": "string"
                },
                "contactNo": {
                    "type": "string"
                },
                "diagnosticCenterid": {
                    "type": "integer",
                    "format": "int32"
                },
                "name": {
                    "type": "string"
                },
                "tests": {
                    "type": "array",
                    "uniqueItems": true,
                    "items": {
                        "$ref": "#/definitions/DiagnosticTest"
                    }
                }
            },
            "title": "DiagnosticCenter"
        },
        "DiagnosticCenterReq": {
            "type": "object",
            "properties": {
                "address": {
                    "type": "string"
                },
                "contactEmail": {
                    "type": "string"
                },
                "contactNo": {
                    "type": "string"
                },
                "diagnosticCenterid": {
                    "type": "integer",
                    "format": "int32"
                },
                "name": {
                    "type": "string"
                }
            },
            "title": "DiagnosticCenterReq"
        },
        "DiagnosticCenterRes": {
            "type": "object",
            "properties": {
                "address": {
                    "type": "string"
                },
                "contactEmail": {
                    "type": "string"
                },
                "contactNo": {
                    "type": "string"
                },
                "diagnosticCenterid": {
                    "type": "integer",
                    "format": "int32"
                },
                "name": {
                    "type": "string"
                },
                "tests": {
                    "type": "array",
                    "uniqueItems": true,
                    "items": {
                        "$ref": "#/definitions/DiagnosticTest"
                    }
                }
            },
            "title": "DiagnosticCenterRes"
        },
        "DiagnosticTest": {
            "type": "object",
            "properties": {
                "diagonasticTestid": {
                    "type": "integer",
                    "format": "int32"
                },
                "normalValue": {
                    "type": "string"
                },
                "testName": {
                    "type": "string"
                },
                "testPrice": {
                    "type": "number",
                    "format": "double"
                },
                "units": {
                    "type": "string"
                }
            },
            "title": "DiagnosticTest"
        },
        "ModelAndView": {
            "type": "object",
            "properties": {
                "empty": {
                    "type": "boolean"
                },
                "model": {
                    "type": "object"
                },
                "modelMap": {
                    "type": "object",
                    "additionalProperties": {
                        "type": "object"
                    }
                },
                "reference": {
                    "type": "boolean"
                },
                "status": {
                    "type": "string",
                    "enum": [
                        "ACCEPTED",
                        "ALREADY_REPORTED",
                        "BAD_GATEWAY",
                        "BAD_REQUEST",
                        "BANDWIDTH_LIMIT_EXCEEDED",
                        "CHECKPOINT",
                        "CONFLICT",
                        "CONTINUE",
                        "CREATED",
                        "DESTINATION_LOCKED",
                        "EXPECTATION_FAILED",
                        "FAILED_DEPENDENCY",
                        "FORBIDDEN",
                        "FOUND",
                        "GATEWAY_TIMEOUT",
                        "GONE",
                        "HTTP_VERSION_NOT_SUPPORTED",
                        "IM_USED",
                        "INSUFFICIENT_SPACE_ON_RESOURCE",
                        "INSUFFICIENT_STORAGE",
                        "INTERNAL_SERVER_ERROR",
                        "I_AM_A_TEAPOT",
                        "LENGTH_REQUIRED",
                        "LOCKED",
                        "LOOP_DETECTED",
                        "METHOD_FAILURE",
                        "METHOD_NOT_ALLOWED",
                        "MOVED_PERMANENTLY",
                        "MOVED_TEMPORARILY",
                        "MULTIPLE_CHOICES",
                        "MULTI_STATUS",
                        "NETWORK_AUTHENTICATION_REQUIRED",
                        "NON_AUTHORITATIVE_INFORMATION",
                        "NOT_ACCEPTABLE",
                        "NOT_EXTENDED",
                        "NOT_FOUND",
                        "NOT_IMPLEMENTED",
                        "NOT_MODIFIED",
                        "NO_CONTENT",
                        "OK",
                        "PARTIAL_CONTENT",
                        "PAYLOAD_TOO_LARGE",
                        "PAYMENT_REQUIRED",
                        "PERMANENT_REDIRECT",
                        "PRECONDITION_FAILED",
                        "PRECONDITION_REQUIRED",
                        "PROCESSING",
                        "PROXY_AUTHENTICATION_REQUIRED",
                        "REQUESTED_RANGE_NOT_SATISFIABLE",
                        "REQUEST_ENTITY_TOO_LARGE",
                        "REQUEST_HEADER_FIELDS_TOO_LARGE",
                        "REQUEST_TIMEOUT",
                        "REQUEST_URI_TOO_LONG",
                        "RESET_CONTENT",
                        "SEE_OTHER",
                        "SERVICE_UNAVAILABLE",
                        "SWITCHING_PROTOCOLS",
                        "TEMPORARY_REDIRECT",
                        "TOO_EARLY",
                        "TOO_MANY_REQUESTS",
                        "UNAUTHORIZED",
                        "UNAVAILABLE_FOR_LEGAL_REASONS",
                        "UNPROCESSABLE_ENTITY",
                        "UNSUPPORTED_MEDIA_TYPE",
                        "UPGRADE_REQUIRED",
                        "URI_TOO_LONG",
                        "USE_PROXY",
                        "VARIANT_ALSO_NEGOTIATES"
                    ]
                },
                "view": {
                    "$ref": "#/definitions/View"
                },
                "viewName": {
                    "type": "string"
                }
            },
            "title": "ModelAndView"
        },
        "Patient": {
            "type": "object",
            "properties": {
                "age": {
                    "type": "integer",
                    "format": "int32"
                },
                "appointments": {
                    "type": "array",
                    "uniqueItems": true,
                    "items": {
                        "$ref": "#/definitions/AppointmentRes"
                    }
                },
                "gender": {
                    "type": "string"
                },
                "name": {
                    "type": "string"
                },
                "patientId": {
                    "type": "integer",
                    "format": "int32"
                },
                "phoneNo": {
                    "type": "string"
                }
            },
            "title": "Patient"
        },
        "PatientReq": {
            "type": "object",
            "properties": {
                "age": {
                    "type": "integer",
                    "format": "int32"
                },
                "gender": {
                    "type": "string"
                },
                "name": {
                    "type": "string"
                },
                "patientId": {
                    "type": "integer",
                    "format": "int32"
                },
                "phoneNo": {
                    "type": "string"
                }
            },
            "title": "PatientReq"
        },
        "PatientRes": {
            "type": "object",
            "properties": {
                "age": {
                    "type": "integer",
                    "format": "int32"
                },
                "appointments": {
                    "type": "array",
                    "uniqueItems": true,
                    "items": {
                        "$ref": "#/definitions/Appointment"
                    }
                },
                "gender": {
                    "type": "string"
                },
                "name": {
                    "type": "string"
                },
                "patientId": {
                    "type": "integer",
                    "format": "int32"
                },
                "phoneNo": {
                    "type": "string"
                }
            },
            "title": "PatientRes"
        },
        "TestResult": {
            "type": "object",
            "properties": {
                "testName": {
                    "type": "string"
                },
                "testReading": {
                    "type": "number",
                    "format": "double"
                },
                "testResultid": {
                    "type": "integer",
                    "format": "int32"
                },
                "testcondition": {
                    "type": "string"
                }
            },
            "title": "TestResult"
        },
        "User": {
            "type": "object",
            "properties": {
                "loggedIn": {
                    "type": "boolean"
                },
                "password": {
                    "type": "string"
                },
                "role": {
                    "type": "string"
                },
                "userid": {
                    "type": "integer",
                    "format": "int32"
                },
                "username": {
                    "type": "string"
                }
            },
            "title": "User"
        },
        "View": {
            "type": "object",
            "properties": {
                "contentType": {
                    "type": "string"
                }
            },
            "title": "View"
        }
    }
}