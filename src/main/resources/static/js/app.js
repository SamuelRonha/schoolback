/**
 * Created by Samuel on 17/06/2017.
 */
var app = angular.module("app", ['ngRoute']);

app.config(function ($routeProvider, $locationProvider) {
    $routeProvider
        .when("/country", {
            templateUrl: "/schoolback/static/view/country.html",
            controller: "countryController"
        }).when("/admin", {
        templateUrl: "/schoolback/static/view/panel/panel.html"
    });
    ;
    $locationProvider.html5Mode({
        enabled: true,
        requireBase: false
    });
});