$(document).ready(function () {
    function addSpinner(clicked) {
        clicked.append(" <span class=\"glyphicon glyphicon-refresh glyphicon-refresh-animate\"></span>");
    }

    function succeed(test,text,number) {
        test.html("<h4><strong class=\"text-center text-dark\" id=\""+text.id+"\" style=\"color:black\">Test "+number+" SUCCESS</strong></h4>");
        test.removeClass("bg-info");
        test.addClass("bg-success");
        test.addClass("black");
    }

    function failed(test,text,number) {
        test.html("<h4><strong class=\"text-center\" id=\""+text.id+"\" style=\"color:black\">Test "+number+" FAILED</strong></h4>");
        test.removeClass("bg-info");
        test.addClass("bg-danger");
        test.addClass("black");
    }

    function runTest(test,text,endpoint,number) {
		var host = $(location).attr('host');
        $.ajax({
            type: "GET",
            url: "http://"+host+"/interview/" + endpoint,
            success: function (result, status, xhr) {
                if(result["message"] == "Hello, World!" && result["code"] == 200) {
                    succeed(test, text,number);
                } else {
                    failed(test, text,number);
                }
            },
            error: function (xhr, status, error) {
                failed(test, text,number);
            }
        });
    }
    function runTestWithOther(test,text,endpoint,number) {
		var host = $(location).attr('host');
        $.ajax({
            type: "GET",
            url: "http://"+host+"/interview/" + endpoint,
            success: function (result, status, xhr) {
                if(result["message"] == "Hello, World!" && result["code"] == 200 && result["otherCode"] == 201) {
                    succeed(test, text,number);
                } else {
                    failed(test, text,number);
                }
            },
            error: function (xhr, status, error) {
                failed(test, text,number);
            }
        });
    }

    $("#test1").click(function (event) {
        addSpinner($("#test1text"));
        runTest($("#test1"), $("#test1text"), "test1", "1");
    });

    $("#test2").click(function (event) {
        addSpinner($("#test2text"));
        runTestWithOther($("#test2"), $("#test2text"), "test2", "2");
    });

    $("#test3").click(function (event) {
        addSpinner($("#test3text"));
        runTest($("#test3"), $("#test3text"), "test3", "3");
    });

    $("#test4").click(function (event) {
        addSpinner($("#test4text"));
        runTest($("#test4"), $("#test4text"), "test4", "4");
    });

    $("#test5").click(function (event) {
        addSpinner($("#test5text"));
        runTestWithOther($("#test5"), $("#test5text"), "test5", "5");
    });

    $("#test6").click(function (event) {
		var host = $(location).attr('host');
        addSpinner($("#test6text"));
        $.ajax({
            type: "GET",
            url: "http://"+host+"/interview/test6?value=H3llo",
            success: function (result, status, xhr) {
                if(result["message"] == "Hello, World!" && result["code"] == 200) {
                    succeed($("#test6"), $("#test6text"), "6");
                } else {
                    failed($("#test6"), $("#test6text"), "6");
                }
            },
            error: function (xhr, status, error) {
                failed($("#test6"), $("#test6text"), "6");
            }
        });
    });
});