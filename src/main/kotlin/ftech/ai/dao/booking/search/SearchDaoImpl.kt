package ftech.ai.dao.booking.search

import ftech.ai.database.ChangeDatabase
import ftech.ai.database.QuerySql
import ftech.ai.factory.DaoFactory
import ftech.ai.model.*

class SearchDaoImpl : ISearchDao {
    var pageRoom = 0
    private var pageHotel = 0

    override fun getSearchRoom(searchRoom: SearchRoom): Response<ResultRoom> {
        if (searchRoom.page == 0) {
            pageRoom = 0
        } else {
            pageRoom += 6
        }

        val sql = QuerySql.sqlRoomSearch(searchRoom, pageRoom)
        val listRoom = DaoFactory.getRoomDao().baseRoom(sql)
        val response = Response<ResultRoom>(Success.CODE, Success.MSG)
        if (listRoom.size >= 6) {
            val resultRoom = ResultRoom(
                listRoom,
                searchRoom.page + 1
            )
            response.data = resultRoom

        } else {
            val resultRoom = ResultRoom(
                listRoom,
                -1
            )
            response.data = resultRoom
        }

        return response
    }

    override fun getSearchHotel(searchHotel: SearchHotel): Response<ResultHotel> {
        if (searchHotel.page == 0) {
            pageHotel = 0
        } else {
            pageHotel += 6
        }
        val sql = QuerySql.sqlHotelSearch(searchHotel, pageHotel)
        val listHotel = DaoFactory.getListHotel().baseHotel(sql)
        val response = Response<ResultHotel>(Success.CODE, Success.MSG)
        if (listHotel.size >= 6) {
            response.data = ResultHotel(listHotel, searchHotel.page + 1)
        } else {
            response.data = ResultHotel(listHotel, -1)
        }
        return response

    }


    override fun getInsert() {
        val listImage: MutableList<ImageInsert> = ArrayList()

//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10019219-db805f74b5cd12def2b7ab3e8cceb551.jpeg?_src=imagekit&tr=h-145,q-40,w-145",
//                260
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10019219-f7adecb62844e8145eb9c6f81546917f.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                260
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10019219-10bc3eda612d2b96b455c56dc54acff6.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                260
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10019219-36acaa83758634e768c8da5dfbb5e812.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                260
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10019219-aae495aee27cde63ea3710e2ac603fa3.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                260
//            )
//        )
//
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10019219-41a4028539be4cd2beeeb36ac6e1fa63.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                261
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10019219-f0c392d743c8d025d87b771c50b6e9a7.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                261
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10019219-9e63f5dd6e0b748e99579040f134d2ff.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                261
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10019219-bea2dfdb47d1fd9133f91021a0da8df0.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                261
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10019219-8d72f44578f406d0820043ff5b11891b.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                261
//            )
//        )
//
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10019219-52dd8ec874eeb1ef0879b033c96ba5d9.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                262
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10019219-7aaed3b12ab9071808ddd7f9a5e3e5e0.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                262
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10019219-b91bcc430f2f87ff36c8f1ae1e07fffa.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                262
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10019219-0b571ad7194b4194108fbe37c612edb2.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                262
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10019219-0562d2e052bbb1416166b76bb7298b9d.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                262
//            )
//        )
//
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10019219-79331f3372ba6d7d11c4dd73af70632b.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                263
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10019219-f7adecb62844e8145eb9c6f81546917f.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                263
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10019219-a591f166274bc41a41ff9077fb9247a3.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                263
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10019219-4b5be52061379c77ee3e878b51e77bd9.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                263
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10019219-74a9d6842ce57f9d3594c1e27467df03.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                263
//            )
//        )
//
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10030576-4a192572c854642af252c55b22068aa7.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                264
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10030576-7931bca1104542f113875fba9162a25b.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                264
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10030576-039b4566373039c572c7b2f743d32809.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                264
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10030576-24a8291e228383ed306cbeafd0ecb672.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                264
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10030576-d4755e27806248ec389306fc9d434541.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                264
//            )
//        )
//
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10030576-f04aab998c6ff7ff81cbd3a30468768e.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                245
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10030576-622d2ef91c3f926a0ef5c67a8ae62121.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                245
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10030576-7bbd64e76b202a8df80fac7756a79c75.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                245
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10030576-7883f66e3160365ccf43ca31f0ca67a2.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                245
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10030576-077f36c0dcd81b04fccec14e1b4084d0.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                245
//            )
//        )
//
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10030576-26265ec53bf93203e958ebf64dd53212.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                246
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10030576-197c6b14940ec662079b7797fb32dc00.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                246
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10030576-3fcf6698f9eb5f74051bec4d36ca1c68.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                246
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10030576-b5471903835251460ef369b3a437bacd.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                246
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10030576-34ada8ebd5eef975aa61dbc0898621f2.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                246
//            )
//        )
//
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10030576-d3955f2b8e1c29e97fef8e2070340e49.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                247
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10030576-24a8291e228383ed306cbeafd0ecb672.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                247
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10030576-3fcf6698f9eb5f74051bec4d36ca1c68.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                247
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10030576-99bb721a305393f92fea836f0875d8d7.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                247
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10030576-1678b84f7e27020e07b7b4022b1f7b08.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                247
//            )
//        )
//
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10030576-622d2ef91c3f926a0ef5c67a8ae62121.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                248
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10030576-178077adb9f259431b416abaaffef6b8.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                248
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10030576-d0540473cf95a1c120f0a6c540a3b1cd.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                248
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10030576-7883f66e3160365ccf43ca31f0ca67a2.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                248
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10030576-227fa7c0f69c7bf7912972301b71e71c.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                248
//            )
//        )
//
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-5de7220035f39103e0f62671d3273c7d.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                275
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-92b7b345796226928635d038b30e21c7.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                275
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-619a89dad9118a1195706e3cdc4f11e5.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                275
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-3f80f3acf98c1e59484d51f79ff11c8e.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                275
//            )
//        )
//        listImage.add(
//            ImageInsert(
//                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-ef4ce4164c71448c0f4e4342fd7ec5db.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
//                275
//            )
//        )

        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-45afafd7c29ad78869a8e6a8d8f02870.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                274
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-ff41d0b307433505da07c556a1ff4ad7.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                274
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-4b570bf3908400fad4c9d08dd82e22e0.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                274
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-c5ecc54b72ad987e4fd8d219e18acde6.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                274
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-0df934a0dd697456193783285ec862c5.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                274
            )
        )

        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-fa7383666f1d0778f23e79b8017d4897.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                273
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-ad55d16d2d15c5ede34504d057640c6f.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                273
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-f41da4c489504b75cc2de48083f47db5.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                273
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-5de7220035f39103e0f62671d3273c7d.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                273
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-442a36602f68528d90394d7150f179ac.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                273
            )
        )

        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-281253364c8a556cb3d10dea380f7606.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                272
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-02f9791c4e53b687dad245cfd41c7ad6.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                272
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-081803c55128ff5d64b5cb5e8013a744.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                272
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-dbafd281d3dbc69d6ef100076820bc22.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                272
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-6770a0d65fff8cf39cc216b71e19ce77.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                272
            )
        )

        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-01b37f26746a6ef58f071d703bb7efa1.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                271
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-acd46dffb612381592f985e6ee29a8fa.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                271
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-8f8d4e2ed0e2a5be5a200d302dfde059.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                271
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-164cf53010f507f13be341f3f1fc2b09.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                271
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-bd492755cecd6396b711a67fc8b89936.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                271
            )
        )

        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-f4c5be75dbe97d6944691df8b2b75ffa.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                270
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-adb888c18dec561af65db2bc3f1f0116.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                270
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-32519b2d59aeddb88d95f4fa05633934.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                270
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-af9dc40be95f3086aae39cb3f11da469.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                270
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-35ae6c601eb91cea555d7d1911b8d6c4.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                270
            )
        )

        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-3298dfeaf340eb9e4256bc81bfb4ddf8.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                269
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-edd4fcb310a6b6ecd5af3e00af62a14a.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                269
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-1291cf9dc8bdaefb3c7c29f313532ae1.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                269
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-4c1011a1d2525ffb8a1bd3b323e00341.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                269
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-684251c09ca79b0c6385c5a78eb2cecc.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                269
            )
        )

        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-934f5c7e3b81a1b93847fd414924993e.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                268
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-f89e1f1f02aaaf4771dc2e5587d5ac60.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                268
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-9990712e8723b4c7ec98a93c571ecb5d.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                268
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-89685f37dda6c14d1f5e1d0c979d95c6.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                268
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-625acad9f93b58b07cb9b46b9d38d9d8.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                268
            )
        )

        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-d50dffd7d3a5dc414715409179f42675.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                267
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-7d3e4d3a7cd667c9e73c5bf19d444275.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                267
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-1634a15b7b26720f680731c3873e511d.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                267
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-aab08b1533c107311da7fe5e91df7357.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                267
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-5d59367ffb2658a632ff7ef6b8bdf8a7.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                267
            )
        )

        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-3f89bc20b1117fa908d68cc11ceed2eb.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                266
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-1a50106d78cbbe42224e8370414b17b0.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                266
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-19737e9110ae08d579199165fab68359.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                266
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-366c0f479fcb2784d313b4abf1d86911.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                266
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-cf7c043af9f2fca4c4d6b743d1509ea3.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                266
            )
        )

        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-9ac2e67a39ed328d6305b2cb7644cbb0.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                265
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-eaf98b737d2eec63d8ed824418d48867.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                265
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-0b0992d4ca562da3b1c109a83d771221.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                265
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/generic-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-e44592b0a1e18664f5162857375882e3.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                265
            )
        )
        listImage.add(
            ImageInsert(
                "https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020591-84b8e0dfb0c9fa584b106c4c7530984d.jpeg?_src=imagekit&tr=c-at_max,h-360,q-40,w-640",
                265
            )
        )

        for (i in 0..49) {
            val sql = """
                insert into travelluxury.image(url,idRoom) value('${listImage[i].url}','${listImage[i].id}')
            """.trimIndent()

            ChangeDatabase.setData(sql)
        }
    }
}