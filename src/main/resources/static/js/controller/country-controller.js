/**
 * Created by Samuel on 17/06/2017.
 */
app.controller("countryController", function ($scope, $http) {
    $scope.countrys = [];
    $scope.country = {};

    $scope.load = function () {
        $http({
            method: 'GET',
            url: 'http://localhost:8080/country'
        }).then(function (response) {
            $scope.country = response.data;
        }, function (response) {

        });
    };

    $scope.save = function () {
        $http({
            method: 'POST',
            url: 'http://localhost:8080/country',
            data: $scope.country
        }).then(function (response) {
            console.log('pop2');
            $scope.country = response.data;
            if(response.status == 201){
                console.log(response);
            }
        }, function (response) {
            if (response.status == 201) {
                console.log(response);
            }
        });
    };
});

