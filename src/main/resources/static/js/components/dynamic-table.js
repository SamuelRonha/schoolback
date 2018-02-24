/**
 * Created by Samuel on 23/09/2017.
 */
var table = angular.modules('app.js', []);

table.controller('dynamicTable', function ($scope, $filter) {
    $scope.sort = {
        sortingOrder: 'id',
        reverse: false
    }

    $scope.gap = 5;

    $scope.filteredItems = [];
    $scope.groupedItems = [];
    $scope.itemsPerPage = 10;
    $scope.pagedItems = [];
    $scope.currentPage = 0;

    $scope.load = function (item) {
        $http({
            method: 'GET',
            url: 'http://localhost:8080/' + item
        }).then(function (response) {
            $scope.filteredItems = response.data;
        }, function (response) {

        });
    };

})