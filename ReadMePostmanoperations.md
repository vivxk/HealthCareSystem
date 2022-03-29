*****Daignostic_Center*****

Post

http://localhost:8091/DiagnosticTest/addNewTest

Input
{
     
        "testName": "Dengue",
        "testPrice": 500,
        "normalValue": "150",
        "units": "Low"
    }

Output
{
    "testName": "Dengue",
    "testPrice": 500.0,
    "normalValue": "150",
    "units": "Low",
    "diagonasticTestid": 29
}
==========================================================================================

Get

http://localhost:8091/DiagnosticTest/getAllTests

Output
[
    {
        "testName": "COVID-19",
        "testPrice": 1200.0,
        "normalValue": "100",
        "units": "Low",
        "diagonasticTestid": 1
    },
    {
        "testName": "MRI_HighEnd",
        "testPrice": 200.0,
        "normalValue": "10",
        "units": "High",
        "diagonasticTestid": 2
    },
    {
        "testName": "MRI_HighEnd",
        "testPrice": 200.0,
        "normalValue": "10",
        "units": "High",
        "diagonasticTestid": 3
    },
    {
        "testName": "MRI_HighEnd",
        "testPrice": 200.0,
        "normalValue": "10",
        "units": "High",
        "diagonasticTestid": 4
    },
    {
        "testName": "MRI_LowEnd",
        "testPrice": 150.0,
        "normalValue": "12",
        "units": "High",
        "diagonasticTestid": 5
    },
    {
        "testName": "COVID-19",
        "testPrice": 1200.0,
        "normalValue": "100",
        "units": "Low",
        "diagonasticTestid": 6
    },
    {
        "testName": "COVID-19",
        "testPrice": 1200.0,
        "normalValue": "100",
        "units": "Low",
        "diagonasticTestid": 7
    },
    {
        "testName": "BP",
        "testPrice": 50.0,
        "normalValue": "120",
        "units": "Normal",
        "diagonasticTestid": 8
    },
    {
        "testName": "COVID-19",
        "testPrice": 1200.0,
        "normalValue": "100",
        "units": "Low",
        "diagonasticTestid": 9
    },
    {
        "testName": "COVID-19",
        "testPrice": 1200.0,
        "normalValue": "100",
        "units": "Low",
        "diagonasticTestid": 10
    },
    {
        "testName": "COVID-19",
        "testPrice": 1200.0,
        "normalValue": "100",
        "units": "Low",
        "diagonasticTestid": 11
    },
    {
        "testName": "COVID-19",
        "testPrice": 1200.0,
        "normalValue": "100",
        "units": "Low",
        "diagonasticTestid": 12
    },
    {
        "testName": "COVID-19",
        "testPrice": 1200.0,
        "normalValue": "100",
        "units": "Low",
        "diagonasticTestid": 13
    },
    {
        "testName": "TB",
        "testPrice": 2500.0,
        "normalValue": "Normal",
        "units": "low",
        "diagonasticTestid": 14
    },
    {
        "testName": "COVID-19",
        "testPrice": 1200.0,
        "normalValue": "100",
        "units": "Low",
        "diagonasticTestid": 15
    },
    {
        "testName": "COVID-19",
        "testPrice": 1200.0,
        "normalValue": "100",
        "units": "Low",
        "diagonasticTestid": 16
    },
    {
        "testName": "COVID-19",
        "testPrice": 1200.0,
        "normalValue": "100",
        "units": "Low",
        "diagonasticTestid": 17
    },
    {
        "testName": "COVID-19",
        "testPrice": 1200.0,
        "normalValue": "100",
        "units": "Low",
        "diagonasticTestid": 21
    },
    {
        "testName": "COVID-19",
        "testPrice": 1200.0,
        "normalValue": "100",
        "units": "Low",
        "diagonasticTestid": 22
    },
    {
        "testName": "COVID-19",
        "testPrice": 1200.0,
        "normalValue": "100",
        "units": "Low",
        "diagonasticTestid": 23
    },
    {
        "testName": "COVID-19",
        "testPrice": 1200.0,
        "normalValue": "100",
        "units": "Low",
        "diagonasticTestid": 24
    },
    {
        "testName": "Cancer",
        "testPrice": 5000.0,
        "normalValue": "50",
        "units": "1st stage",
        "diagonasticTestid": 25
    },
    {
        "testName": "COVID-19",
        "testPrice": 1200.0,
        "normalValue": "100",
        "units": "Low",
        "diagonasticTestid": 26
    },
    {
        "testName": "Cancer",
        "testPrice": 5000.0,
        "normalValue": "50",
        "units": "1st stage",
        "diagonasticTestid": 27
    },
    {
        "testName": "Dengue",
        "testPrice": 500.0,
        "normalValue": "150",
        "units": "Low",
        "diagonasticTestid": 29
    }
]
==========================================================================================

Get

http://localhost:8091/DiagnosticTest/getTestById/29

Output
{
    "testName": "Dengue",
    "testPrice": 500.0,
    "normalValue": "150",
    "units": "Low",
    "diagonasticTestid": 29
}
==========================================================================================

*****DiagnosticCenter*****

post:

http://localhost:8099/DiagnosticCenter/addDiagnosticCenter
{
    "name":"gaurav",
    "contactNo":"88997",
    "address":"jalna",
    "contactEmail":"gaurav@gmail.com",
    "tests":3

    

    }
===================================================================================

get:

http://localhost:8099/DiagnosticCenter/getDiagnosticCenters


[
    {
        "diagnosticCenterid": 1,
        "name": "kol",
        "contactNo": "267276",
        "address": "1-2-4",
        "contactEmail": "sachinmc@123.com",
        "tests": []
    },
    {
        "diagnosticCenterid": 5,
        "name": "ajay",
        "contactNo": "9876",
        "address": "akola",
        "contactEmail": "abc@gmail.com",
        "tests": []
    },
    {
        "diagnosticCenterid": 6,
        "name": "dhiraj",
        "contactNo": "987689",
        "address": "Aurangabad",
        "contactEmail": "dhiraj@123.com",
        "tests": []
    },
    {
        "diagnosticCenterid": 7,
        "name": "dhiraj",
        "contactNo": "987689",
        "address": "Aurangabad",
        "contactEmail": "dhiraj@123.com",
        "tests": []
    },
    {
        "diagnosticCenterid": 8,
        "name": "kol",
        "contactNo": "267276",
        "address": "1-2-4",
        "contactEmail": "sachinmc@123.com",
        "tests": []
    },
    {
        "diagnosticCenterid": 9,
        "name": "gaurav",
        "contactNo": "88997",
        "address": "jalna",
        "contactEmail": "gaurav@gmail.com",
        "tests": []
    },
    {
        "diagnosticCenterid": 10,
        "name": "kewal",
        "contactNo": "abc@gmail.com",
        "address": "yavtamal",
        "contactEmail": "abc@gmail.com",
        "tests": []
    },
    {
        "diagnosticCenterid": 11,
        "name": "gaurav",
        "contactNo": "88997",
        "address": "jalna",
        "contactEmail": "gaurav@gmail.com",
        "tests": []
    }
]

===================================================================================

DELETE(REMOVE)

http://localhost:8099/DiagnosticCenter/removeDiagnosticCenter/10
{
    "diagnosticCenterid": 10,
    "name": "kewal",
    "contactNo": "abc@gmail.com",
    "address": "yavtamal",
    "contactEmail": "abc@gmail.com",
    "tests": []
}

===================================================================================
PUT:

{
    "diagnosticCenterid": 11,
    "name":"AAkash",
    "contactNo":"9898987",
    "address":"latur",
    "contactEmail":"aakash@gmail.com",
    "tests":2
}
======================================================================================
*******TestResult*******

GET ALL TEST RESULTS

GET: localhost:8080/testresult/getAllTestResults

[
    {
        "testResultid": 6,
        "testName": "thyroid test",
        "testReading": 7500022.0,
        "testcondition": null
    },
    {
        "testResultid": 7,
        "testName": "Vitamin Test",
        "testReading": 7500022.0,
        "testcondition": null
    },
    {
        "testResultid": 8,
        "testName": "mineral Test",
        "testReading": 7500022.0,
        "testcondition": null
    },
    {
        "testResultid": 9,
        "testName": "bp  Test",
        "testReading": 7500022.0,
        "testcondition": null
    }
]

ADD TEST RESULT
POST : localhost:8080/testresult//addresult
{
        "testResultid": 10,
        "testName": "BLOOD test",
        "testReading": 7500022.0,
        "testcondition": null
    }
OUTPUT:
{
        "testResultid": 10,
        "testName": "BLOOD test",
        "testReading": 7500022.0,
        "testcondition": null
    }

UPDATE TEST RESULT

PUT:localhost:8080/testresult/updateresult/10
{
        "testResultid":10,
        "testName": "SUGAR test",
        "testReading": 7500022.0,
        "testcondition": null
    }

OUTPUT:
{
        "testResultid":10,
        "testName": "SUGAR test",
        "testReading": 7500022.0,
        "testcondition": null
    }

REMOVE TEST RESULT

DELETE:localhost:8080/testresult/removeresult/10

OUTPUT:
[
    {
        "testResultid": 6,
        "testName": "thyroid test",
        "testReading": 7500022.0,
        "testcondition": null
    },
    {
        "testResultid": 7,
        "testName": "Vitamin Test",
        "testReading": 7500022.0,
        "testcondition": null
    },
    {
        "testResultid": 8,
        "testName": "mineral Test",
        "testReading": 7500022.0,
        "testcondition": null
    },
    {
        "testResultid": 9,
        "testName": "bp  Test",
        "testReading": 7500022.0,
        "testcondition": null
    },
    {
        "testResultid": 11,
        "testName": "Full Body test",
        "testReading": 7500022.0,
        "testcondition": null
    }
]

GET TEST RESULT BY PATIENT ID

GET:localhost:8080/testresult/resultbyid/11

OUTPUT:
{
    "testResultid": 11,
    "testName": "Full Body test",
    "testReading": 7500022.0,
    "testcondition": null
}