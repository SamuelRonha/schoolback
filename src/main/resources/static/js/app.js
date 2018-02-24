/**
 * Created by Samuel on 17/06/2017.
 */
var app = angular.module("app", ['ui.router']);

// app.config(function ($stateProvider, $locationProvider) {
//
//     var panel = {
//         name: 'admin',
//         url: '/admin',
//         templateUrl: 'view/panel/panel.html'
//     }
//     var country = {
//         name: 'country',
//         url: 'view/country',
//         templateUrl: '../country.html',
//         controller: 'countryController'
//     }
//
//     var home = {
//         name: 'index',
//         url: '/index',
//         templateUrl: 'index.html'
//     }
//     $stateProvider.state(panel);
//     $stateProvider.state(home);
//     $stateProvider.state(country);
//     $locationProvider.html5Mode({
//         enabled: true,
//         requireBase: true
//     });
// });


app.config(['$stateProvider', '$urlRouterProvider', '$locationProvider',
    function ($stateProvider, $urlRouterProvider, $locationProvider) {
        $urlRouterProvider.otherwise("/");

        $stateProvider
            .state('app', {
                url: "/",
                views: {
                    "content": {templateUrl: "../index.html"}
                }
            })
            .state('app.admin', {
                url: "admin",
                views: {
                    "content": {templateUrl: "../view/panel/panel.html"}
                }
            })
            .state('app.admin.country', {
                url: "country",
                views: {
                    "content": {templateUrl: "../view/country.html"}
                }
            });

        // $state.go("app.admin", {}, {reload: "admin"})

        // $state.transitionTo($state.current, $stateParams, {
        //     reload: true, inherit: false, notify: true
        // });

        $locationProvider.html5Mode({
            enabled: true,
            requireBase: true
        });

    }
])
    .run(['$rootScope', '$state', function ($rootScope, $state) {
        $rootScope.sillyQA = function () {
            if ($state.current.name === 'admin') {
                $state.go('admin', {}, {reload: true});
            }
        }

        $rootScope.$on('$stateChangeStart', function (event, toState, toParams, fromState, fromParams) {
            console.log('toState:   ' + toState.name)
            console.log('fromState: ' + (fromState.name || 'Just got there! click again!'))
        })
    }])
;

