/**
 * Created by Samuel on 11/10/2017.
 */
app.controller("owlController", function () {
    $('.owl-carousel').owlCarousel({
        loop: true,
//        autoWidth: true,
        dots: true,
        nav: true,
        margin: 10,
        responsiveClass: true,

        center: true,
        autoplay: true,
        autoplayTimeout: 3000,
        autoplayHoverPause: true,
        items: 1,
        responsiveRefreshRate: 100,
        navText: ['<svg width="100%" height="100%" viewBox="0 0 11 20"><path style="fill:none;stroke-width: 1px;stroke: #000;" d="M9.554,1.001l-8.607,8.607l8.607,8.606"/></svg>', '<svg width="100%" height="100%" viewBox="0 0 11 20" version="1.1"><path style="fill:none;stroke-width: 1px;stroke: #000;" d="M1.054,18.214l8.606,-8.606l-8.606,-8.607"/></svg>'],
//            responsive: {
//                0: {
//                    items: 1
//                },
//                600: {
//                    items: 1
//                },
//                1000: {
//                    items: 1
//                }
//            }
    })
});