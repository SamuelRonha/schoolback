/**
 * Created by Samuel on 17/06/2017.
 */
var app = angular.module("app", ['ngRoute']);

app.config(function ($routeProvider, $locationProvider) {
    $routeProvider.when("/country", {
        templateUrl: "view/country.html",
        controller: "countryController"
    });
    $locationProvider.html5Mode({
        enabled: true,
        requireBase: false
    });
});