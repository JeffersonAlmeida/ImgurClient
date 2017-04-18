package com.mobilabsolutions.imgurclient.mocks;


import com.google.gson.Gson;
import com.mobilabsolutions.imgurclient.model.ImgurResults;
import com.mobilabsolutions.imgurclient.remote.Service;

import java.io.FileNotFoundException;
import java.io.IOException;

import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

public class MockService implements Service {

    public Observable<ImgurResults> fetchImgurImages() {
        ImgurResults mockData = null;
        try {
            mockData = getMockData();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
        return Observable.just(mockData);
    }

    public ImgurResults getMockData() throws IOException {
        Gson gson = new Gson();
        ImgurResults imgurResults = gson.fromJson(getJson(), ImgurResults.class);
        return imgurResults;
    }

    public String getJson(){
      return "{\n" +
              "  \"data\": [\n" +
              "    {\n" +
              "      \"id\": \"EqYfrBf\",\n" +
              "      \"title\": \"Giving your 110%\",\n" +
              "      \"description\": null,\n" +
              "      \"datetime\": 1491829438,\n" +
              "      \"type\": \"image/gif\",\n" +
              "      \"animated\": true,\n" +
              "      \"width\": 398,\n" +
              "      \"height\": 577,\n" +
              "      \"size\": 52695632,\n" +
              "      \"views\": 6589839,\n" +
              "      \"bandwidth\": 347255730883248,\n" +
              "      \"vote\": null,\n" +
              "      \"favorite\": false,\n" +
              "      \"nsfw\": false,\n" +
              "      \"section\": \"aww\",\n" +
              "      \"account_url\": \"ShadowbanMyAss\",\n" +
              "      \"account_id\": 38290133,\n" +
              "      \"is_ad\": false,\n" +
              "      \"tags\": [],\n" +
              "      \"in_most_viral\": true,\n" +
              "      \"in_gallery\": true,\n" +
              "      \"topic\": \"No Topic\",\n" +
              "      \"topic_id\": 29,\n" +
              "      \"mp4\": \"http://i.imgur.com/EqYfrBf.mp4\",\n" +
              "      \"gifv\": \"http://i.imgur.com/EqYfrBf.gifv\",\n" +
              "      \"mp4_size\": 3985787,\n" +
              "      \"link\": \"http://i.imgur.com/EqYfrBfh.gif\",\n" +
              "      \"looping\": true,\n" +
              "      \"comment_count\": 779,\n" +
              "      \"ups\": 15003,\n" +
              "      \"downs\": 185,\n" +
              "      \"points\": 14818,\n" +
              "      \"score\": 18112,\n" +
              "      \"is_album\": false\n" +
              "    },\n" +
              "    {\n" +
              "      \"id\": \"hXEm4\",\n" +
              "      \"title\": \"Your First Metal Concert: A Scientific Guide, Part 1\",\n" +
              "      \"description\": null,\n" +
              "      \"datetime\": 1491829674,\n" +
              "      \"cover\": \"qW2YRBg\",\n" +
              "      \"cover_width\": 585,\n" +
              "      \"cover_height\": 366,\n" +
              "      \"account_url\": \"Voodrew\",\n" +
              "      \"account_id\": 1217234,\n" +
              "      \"privacy\": \"public\",\n" +
              "      \"layout\": \"blog\",\n" +
              "      \"views\": 208062,\n" +
              "      \"link\": \"http://imgur.com/a/hXEm4\",\n" +
              "      \"ups\": 4738,\n" +
              "      \"downs\": 154,\n" +
              "      \"points\": 4584,\n" +
              "      \"score\": 4584,\n" +
              "      \"is_album\": true,\n" +
              "      \"vote\": null,\n" +
              "      \"favorite\": false,\n" +
              "      \"nsfw\": false,\n" +
              "      \"section\": \"\",\n" +
              "      \"comment_count\": 580,\n" +
              "      \"topic\": \"No Topic\",\n" +
              "      \"topic_id\": 29,\n" +
              "      \"images_count\": 9,\n" +
              "      \"in_gallery\": true,\n" +
              "      \"is_ad\": false,\n" +
              "      \"tags\": [\n" +
              "        {\n" +
              "          \"name\": \"informative\",\n" +
              "          \"display_name\": \"informative\",\n" +
              "          \"followers\": 108,\n" +
              "          \"total_items\": 101671\n" +
              "        },\n" +
              "        {\n" +
              "          \"name\": \"heavy_metal\",\n" +
              "          \"display_name\": \"heavy metal\",\n" +
              "          \"followers\": 0,\n" +
              "          \"total_items\": 129\n" +
              "        }\n" +
              "      ],\n" +
              "      \"in_most_viral\": true\n" +
              "    },\n" +
              "    {\n" +
              "      \"id\": \"UHrES\",\n" +
              "      \"title\": \"Chechnya 'opens world first concentration camp for homosexuals'\",\n" +
              "      \"description\": null,\n" +
              "      \"datetime\": 1491847288,\n" +
              "      \"cover\": \"Z8pFavp\",\n" +
              "      \"cover_width\": 3024,\n" +
              "      \"cover_height\": 3160,\n" +
              "      \"account_url\": \"AreWeGladiatorsOrAreWeBitches\",\n" +
              "      \"account_id\": 6873314,\n" +
              "      \"privacy\": \"public\",\n" +
              "      \"layout\": \"blog\",\n" +
              "      \"views\": 59337,\n" +
              "      \"link\": \"http://imgur.com/a/UHrES\",\n" +
              "      \"ups\": 1910,\n" +
              "      \"downs\": 61,\n" +
              "      \"points\": 1849,\n" +
              "      \"score\": 1849,\n" +
              "      \"is_album\": true,\n" +
              "      \"vote\": null,\n" +
              "      \"favorite\": false,\n" +
              "      \"nsfw\": false,\n" +
              "      \"section\": \"The_Donald\",\n" +
              "      \"comment_count\": 294,\n" +
              "      \"topic\": \"No Topic\",\n" +
              "      \"topic_id\": 29,\n" +
              "      \"images_count\": 4,\n" +
              "      \"in_gallery\": true,\n" +
              "      \"is_ad\": false,\n" +
              "      \"tags\": [\n" +
              "        {\n" +
              "          \"name\": \"wtf\",\n" +
              "          \"display_name\": \"wtf\",\n" +
              "          \"followers\": 405,\n" +
              "          \"total_items\": 14503\n" +
              "        },\n" +
              "        {\n" +
              "          \"name\": \"current_events\",\n" +
              "          \"display_name\": \"current events\",\n" +
              "          \"followers\": 27,\n" +
              "          \"total_items\": 3810\n" +
              "        },\n" +
              "        {\n" +
              "          \"name\": \"world_news\",\n" +
              "          \"display_name\": \"world news\",\n" +
              "          \"followers\": 3,\n" +
              "          \"total_items\": 37\n" +
              "        },\n" +
              "        {\n" +
              "          \"name\": \"you_gotta_be_shittin_me\",\n" +
              "          \"display_name\": \"you gotta be shittin me\",\n" +
              "          \"followers\": 0,\n" +
              "          \"total_items\": 0\n" +
              "        },\n" +
              "        {\n" +
              "          \"name\": \"doggotax\",\n" +
              "          \"display_name\": \"doggotax\",\n" +
              "          \"followers\": 0,\n" +
              "          \"total_items\": 0\n" +
              "        }\n" +
              "      ],\n" +
              "      \"in_most_viral\": true\n" +
              "    },\n" +
              "    {\n" +
              "      \"id\": \"Q3Rfy\",\n" +
              "      \"title\": \"A much needed service\",\n" +
              "      \"description\": null,\n" +
              "      \"datetime\": 1491824394,\n" +
              "      \"cover\": \"R1JHKMk\",\n" +
              "      \"cover_width\": 700,\n" +
              "      \"cover_height\": 4659,\n" +
              "      \"account_url\": \"BVELLI\",\n" +
              "      \"account_id\": 42233283,\n" +
              "      \"privacy\": \"public\",\n" +
              "      \"layout\": \"blog\",\n" +
              "      \"views\": 253483,\n" +
              "      \"link\": \"http://imgur.com/a/Q3Rfy\",\n" +
              "      \"ups\": 5945,\n" +
              "      \"downs\": 259,\n" +
              "      \"points\": 5686,\n" +
              "      \"score\": 5686,\n" +
              "      \"is_album\": true,\n" +
              "      \"vote\": null,\n" +
              "      \"favorite\": false,\n" +
              "      \"nsfw\": false,\n" +
              "      \"section\": \"\",\n" +
              "      \"comment_count\": 213,\n" +
              "      \"topic\": \"No Topic\",\n" +
              "      \"topic_id\": 29,\n" +
              "      \"images_count\": 1,\n" +
              "      \"in_gallery\": true,\n" +
              "      \"is_ad\": false,\n" +
              "      \"tags\": [],\n" +
              "      \"in_most_viral\": true\n" +
              "    },\n" +
              "    {\n" +
              "      \"id\": \"P7cCW\",\n" +
              "      \"title\": \"Man Forcibly Removed From United Flight \",\n" +
              "      \"description\": null,\n" +
              "      \"datetime\": 1491805118,\n" +
              "      \"cover\": \"EXuO7HL\",\n" +
              "      \"cover_width\": 430,\n" +
              "      \"cover_height\": 622,\n" +
              "      \"account_url\": \"AbortedFetusNecrophiliac\",\n" +
              "      \"account_id\": 36743987,\n" +
              "      \"privacy\": \"hidden\",\n" +
              "      \"layout\": \"blog\",\n" +
              "      \"views\": 515832,\n" +
              "      \"link\": \"http://imgur.com/a/P7cCW\",\n" +
              "      \"ups\": 15416,\n" +
              "      \"downs\": 209,\n" +
              "      \"points\": 15207,\n" +
              "      \"score\": 15207,\n" +
              "      \"is_album\": true,\n" +
              "      \"vote\": null,\n" +
              "      \"favorite\": false,\n" +
              "      \"nsfw\": false,\n" +
              "      \"section\": \"LateStageCapitalism\",\n" +
              "      \"comment_count\": 3663,\n" +
              "      \"topic\": \"No Topic\",\n" +
              "      \"topic_id\": 29,\n" +
              "      \"images_count\": 1,\n" +
              "      \"in_gallery\": true,\n" +
              "      \"is_ad\": false,\n" +
              "      \"tags\": [\n" +
              "        {\n" +
              "          \"name\": \"united_airlines\",\n" +
              "          \"display_name\": \"united airlines\",\n" +
              "          \"followers\": 0,\n" +
              "          \"total_items\": 22\n" +
              "        }\n" +
              "      ],\n" +
              "      \"in_most_viral\": true\n" +
              "    },\n" +
              "    {\n" +
              "      \"id\": \"KwXYb\",\n" +
              "      \"title\": \". . .\",\n" +
              "      \"description\": null,\n" +
              "      \"datetime\": 1491835045,\n" +
              "      \"cover\": \"nnESdj9\",\n" +
              "      \"cover_width\": 1280,\n" +
              "      \"cover_height\": 1719,\n" +
              "      \"account_url\": \"MezzedUp\",\n" +
              "      \"account_id\": 15196056,\n" +
              "      \"privacy\": \"hidden\",\n" +
              "      \"layout\": \"blog\",\n" +
              "      \"views\": 150475,\n" +
              "      \"link\": \"http://imgur.com/a/KwXYb\",\n" +
              "      \"ups\": 3356,\n" +
              "      \"downs\": 83,\n" +
              "      \"points\": 3273,\n" +
              "      \"score\": 3273,\n" +
              "      \"is_album\": true,\n" +
              "      \"vote\": null,\n" +
              "      \"favorite\": false,\n" +
              "      \"nsfw\": false,\n" +
              "      \"section\": \"\",\n" +
              "      \"comment_count\": 161,\n" +
              "      \"topic\": \"No Topic\",\n" +
              "      \"topic_id\": 29,\n" +
              "      \"images_count\": 1,\n" +
              "      \"in_gallery\": true,\n" +
              "      \"is_ad\": false,\n" +
              "      \"tags\": [\n" +
              "        {\n" +
              "          \"name\": \"gaming\",\n" +
              "          \"display_name\": \"gaming\",\n" +
              "          \"followers\": 1926,\n" +
              "          \"total_items\": 116975\n" +
              "        },\n" +
              "        {\n" +
              "          \"name\": \"zelda\",\n" +
              "          \"display_name\": \"zelda\",\n" +
              "          \"followers\": 30,\n" +
              "          \"total_items\": 1821\n" +
              "        },\n" +
              "        {\n" +
              "          \"name\": \"legend_of_zelda\",\n" +
              "          \"display_name\": \"legend of zelda\",\n" +
              "          \"followers\": 15,\n" +
              "          \"total_items\": 819\n" +
              "        }\n" +
              "      ],\n" +
              "      \"in_most_viral\": true\n" +
              "    },\n" +
              "    {\n" +
              "      \"id\": \"lbBr7\",\n" +
              "      \"title\": \"When I have something stuck on my shoe and wont get off. \",\n" +
              "      \"description\": null,\n" +
              "      \"datetime\": 1491845282,\n" +
              "      \"cover\": \"wnjkoFs\",\n" +
              "      \"cover_width\": 640,\n" +
              "      \"cover_height\": 360,\n" +
              "      \"account_url\": \"BreakboyHex\",\n" +
              "      \"account_id\": 3087340,\n" +
              "      \"privacy\": \"public\",\n" +
              "      \"layout\": \"blog\",\n" +
              "      \"views\": 66295,\n" +
              "      \"link\": \"http://imgur.com/a/lbBr7\",\n" +
              "      \"ups\": 1956,\n" +
              "      \"downs\": 40,\n" +
              "      \"points\": 1916,\n" +
              "      \"score\": 1916,\n" +
              "      \"is_album\": true,\n" +
              "      \"vote\": null,\n" +
              "      \"favorite\": false,\n" +
              "      \"nsfw\": false,\n" +
              "      \"section\": \"funny\",\n" +
              "      \"comment_count\": 60,\n" +
              "      \"topic\": \"No Topic\",\n" +
              "      \"topic_id\": 29,\n" +
              "      \"images_count\": 1,\n" +
              "      \"in_gallery\": true,\n" +
              "      \"is_ad\": false,\n" +
              "      \"tags\": [],\n" +
              "      \"in_most_viral\": true\n" +
              "    },\n" +
              "    {\n" +
              "      \"id\": \"oQHTk\",\n" +
              "      \"title\": \"Breaking News: We bring you United Airlines' official statement regarding the costumer they dragged off the plane.\",\n" +
              "      \"description\": null,\n" +
              "      \"datetime\": 1491844127,\n" +
              "      \"cover\": \"PR5bk6J\",\n" +
              "      \"cover_width\": 500,\n" +
              "      \"cover_height\": 376,\n" +
              "      \"account_url\": \"BrotherAlbania\",\n" +
              "      \"account_id\": 2551522,\n" +
              "      \"privacy\": \"hidden\",\n" +
              "      \"layout\": \"blog\",\n" +
              "      \"views\": 68018,\n" +
              "      \"link\": \"http://imgur.com/a/oQHTk\",\n" +
              "      \"ups\": 2048,\n" +
              "      \"downs\": 44,\n" +
              "      \"points\": 2004,\n" +
              "      \"score\": 2004,\n" +
              "      \"is_album\": true,\n" +
              "      \"vote\": null,\n" +
              "      \"favorite\": false,\n" +
              "      \"nsfw\": false,\n" +
              "      \"section\": \"\",\n" +
              "      \"comment_count\": 89,\n" +
              "      \"topic\": \"No Topic\",\n" +
              "      \"topic_id\": 29,\n" +
              "      \"images_count\": 1,\n" +
              "      \"in_gallery\": true,\n" +
              "      \"is_ad\": false,\n" +
              "      \"tags\": [],\n" +
              "      \"in_most_viral\": true\n" +
              "    },\n" +
              "    {\n" +
              "      \"id\": \"TlACS\",\n" +
              "      \"title\": \"Cool photos that aren't photoshopped\",\n" +
              "      \"description\": null,\n" +
              "      \"datetime\": 1491818124,\n" +
              "      \"cover\": \"FvIUtia\",\n" +
              "      \"cover_width\": 700,\n" +
              "      \"cover_height\": 1040,\n" +
              "      \"account_url\": \"Flav606\",\n" +
              "      \"account_id\": 13149944,\n" +
              "      \"privacy\": \"hidden\",\n" +
              "      \"layout\": \"blog\",\n" +
              "      \"views\": 326290,\n" +
              "      \"link\": \"http://imgur.com/a/TlACS\",\n" +
              "      \"ups\": 7675,\n" +
              "      \"downs\": 129,\n" +
              "      \"points\": 7546,\n" +
              "      \"score\": 7546,\n" +
              "      \"is_album\": true,\n" +
              "      \"vote\": null,\n" +
              "      \"favorite\": false,\n" +
              "      \"nsfw\": false,\n" +
              "      \"section\": \"\",\n" +
              "      \"comment_count\": 335,\n" +
              "      \"topic\": \"No Topic\",\n" +
              "      \"topic_id\": 29,\n" +
              "      \"images_count\": 8,\n" +
              "      \"in_gallery\": true,\n" +
              "      \"is_ad\": false,\n" +
              "      \"tags\": [],\n" +
              "      \"in_most_viral\": true\n" +
              "    },\n" +
              "    {\n" +
              "      \"id\": \"RsInt\",\n" +
              "      \"title\": \"R.I.P Ben\",\n" +
              "      \"description\": null,\n" +
              "      \"datetime\": 1491834284,\n" +
              "      \"cover\": \"1B3Bm5s\",\n" +
              "      \"cover_width\": 750,\n" +
              "      \"cover_height\": 522,\n" +
              "      \"account_url\": \"Imgurian192\",\n" +
              "      \"account_id\": 41718368,\n" +
              "      \"privacy\": \"public\",\n" +
              "      \"layout\": \"blog\",\n" +
              "      \"views\": 138059,\n" +
              "      \"link\": \"http://imgur.com/a/RsInt\",\n" +
              "      \"ups\": 3366,\n" +
              "      \"downs\": 99,\n" +
              "      \"points\": 3267,\n" +
              "      \"score\": 3267,\n" +
              "      \"is_album\": true,\n" +
              "      \"vote\": null,\n" +
              "      \"favorite\": false,\n" +
              "      \"nsfw\": false,\n" +
              "      \"section\": \"\",\n" +
              "      \"comment_count\": 496,\n" +
              "      \"topic\": \"No Topic\",\n" +
              "      \"topic_id\": 29,\n" +
              "      \"images_count\": 4,\n" +
              "      \"in_gallery\": true,\n" +
              "      \"is_ad\": false,\n" +
              "      \"tags\": [],\n" +
              "      \"in_most_viral\": true\n" +
              "    },\n" +
              "    {\n" +
              "      \"id\": \"lf4k0Wj\",\n" +
              "      \"title\": \"Mmmmmmmmmm nom nom nom\",\n" +
              "      \"description\": \"my American dream.\\none fine day I'll make it\",\n" +
              "      \"datetime\": 1491836123,\n" +
              "      \"type\": \"image/gif\",\n" +
              "      \"animated\": true,\n" +
              "      \"width\": 460,\n" +
              "      \"height\": 458,\n" +
              "      \"size\": 41484446,\n" +
              "      \"views\": 507271,\n" +
              "      \"bandwidth\": 21043856406866,\n" +
              "      \"vote\": null,\n" +
              "      \"favorite\": false,\n" +
              "      \"nsfw\": false,\n" +
              "      \"section\": \"\",\n" +
              "      \"account_url\": \"HereRun\",\n" +
              "      \"account_id\": 57468437,\n" +
              "      \"is_ad\": false,\n" +
              "      \"tags\": [\n" +
              "        {\n" +
              "          \"name\": \"funny\",\n" +
              "          \"display_name\": \"funny\",\n" +
              "          \"followers\": 2611,\n" +
              "          \"total_items\": 358293\n" +
              "        }\n" +
              "      ],\n" +
              "      \"in_most_viral\": true,\n" +
              "      \"in_gallery\": true,\n" +
              "      \"topic\": \"No Topic\",\n" +
              "      \"topic_id\": 29,\n" +
              "      \"mp4\": \"http://i.imgur.com/lf4k0Wj.mp4\",\n" +
              "      \"gifv\": \"http://i.imgur.com/lf4k0Wj.gifv\",\n" +
              "      \"mp4_size\": 6748830,\n" +
              "      \"link\": \"http://i.imgur.com/lf4k0Wjh.gif\",\n" +
              "      \"looping\": true,\n" +
              "      \"comment_count\": 439,\n" +
              "      \"ups\": 3363,\n" +
              "      \"downs\": 422,\n" +
              "      \"points\": 2941,\n" +
              "      \"score\": 3194,\n" +
              "      \"is_album\": false\n" +
              "    },\n" +
              "    {\n" +
              "      \"id\": \"dJz9jRr\",\n" +
              "      \"title\": \"#holdmypepsi\",\n" +
              "      \"description\": \"Context: United forces passenger out of the plane after overbooking flight.\\n\\nalso... fuck you Dan.... you could've at least tried\\n\\nHi Usersub!\",\n" +
              "      \"datetime\": 1491840893,\n" +
              "      \"type\": \"image/jpeg\",\n" +
              "      \"animated\": false,\n" +
              "      \"width\": 585,\n" +
              "      \"height\": 508,\n" +
              "      \"size\": 35654,\n" +
              "      \"views\": 79917,\n" +
              "      \"bandwidth\": 2849360718,\n" +
              "      \"vote\": null,\n" +
              "      \"favorite\": false,\n" +
              "      \"nsfw\": false,\n" +
              "      \"section\": \"\",\n" +
              "      \"account_url\": \"OhMyGurs\",\n" +
              "      \"account_id\": 16187838,\n" +
              "      \"is_ad\": false,\n" +
              "      \"tags\": [\n" +
              "        {\n" +
              "          \"name\": \"united_airlines\",\n" +
              "          \"display_name\": \"united airlines\",\n" +
              "          \"followers\": 0,\n" +
              "          \"total_items\": 22\n" +
              "        }\n" +
              "      ],\n" +
              "      \"in_most_viral\": true,\n" +
              "      \"in_gallery\": true,\n" +
              "      \"topic\": \"No Topic\",\n" +
              "      \"topic_id\": 29,\n" +
              "      \"link\": \"http://i.imgur.com/dJz9jRr.jpg\",\n" +
              "      \"comment_count\": 200,\n" +
              "      \"ups\": 2343,\n" +
              "      \"downs\": 67,\n" +
              "      \"points\": 2276,\n" +
              "      \"score\": 2315,\n" +
              "      \"is_album\": false\n" +
              "    },\n" +
              "    {\n" +
              "      \"id\": \"NyRah\",\n" +
              "      \"title\": \"This is what freedom of speech is...\",\n" +
              "      \"description\": null,\n" +
              "      \"datetime\": 1491848027,\n" +
              "      \"cover\": \"GfbgwOM\",\n" +
              "      \"cover_width\": 938,\n" +
              "      \"cover_height\": 704,\n" +
              "      \"account_url\": \"therearenowords\",\n" +
              "      \"account_id\": 22407981,\n" +
              "      \"privacy\": \"hidden\",\n" +
              "      \"layout\": \"blog\",\n" +
              "      \"views\": 55544,\n" +
              "      \"link\": \"http://imgur.com/a/NyRah\",\n" +
              "      \"ups\": 1622,\n" +
              "      \"downs\": 100,\n" +
              "      \"points\": 1522,\n" +
              "      \"score\": 1522,\n" +
              "      \"is_album\": true,\n" +
              "      \"vote\": null,\n" +
              "      \"favorite\": false,\n" +
              "      \"nsfw\": false,\n" +
              "      \"section\": \"\",\n" +
              "      \"comment_count\": 424,\n" +
              "      \"topic\": \"No Topic\",\n" +
              "      \"topic_id\": 29,\n" +
              "      \"images_count\": 1,\n" +
              "      \"in_gallery\": true,\n" +
              "      \"is_ad\": false,\n" +
              "      \"tags\": [],\n" +
              "      \"in_most_viral\": true\n" +
              "    },\n" +
              "    {\n" +
              "      \"id\": \"7m0Kz\",\n" +
              "      \"title\": \"Eh\",\n" +
              "      \"description\": null,\n" +
              "      \"datetime\": 1491820474,\n" +
              "      \"cover\": \"nqNnfhp\",\n" +
              "      \"cover_width\": 625,\n" +
              "      \"cover_height\": 492,\n" +
              "      \"account_url\": \"9307103\",\n" +
              "      \"account_id\": 16122981,\n" +
              "      \"privacy\": \"hidden\",\n" +
              "      \"layout\": \"blog\",\n" +
              "      \"views\": 254961,\n" +
              "      \"link\": \"http://imgur.com/a/7m0Kz\",\n" +
              "      \"ups\": 6625,\n" +
              "      \"downs\": 435,\n" +
              "      \"points\": 6190,\n" +
              "      \"score\": 6190,\n" +
              "      \"is_album\": true,\n" +
              "      \"vote\": null,\n" +
              "      \"favorite\": false,\n" +
              "      \"nsfw\": false,\n" +
              "      \"section\": \"\",\n" +
              "      \"comment_count\": 794,\n" +
              "      \"topic\": \"No Topic\",\n" +
              "      \"topic_id\": 29,\n" +
              "      \"images_count\": 1,\n" +
              "      \"in_gallery\": true,\n" +
              "      \"is_ad\": false,\n" +
              "      \"tags\": [\n" +
              "        {\n" +
              "          \"name\": \"funny\",\n" +
              "          \"display_name\": \"funny\",\n" +
              "          \"followers\": 2611,\n" +
              "          \"total_items\": 358293\n" +
              "        },\n" +
              "        {\n" +
              "          \"name\": \"canada\",\n" +
              "          \"display_name\": \"canada\",\n" +
              "          \"followers\": 20,\n" +
              "          \"total_items\": 3234\n" +
              "        },\n" +
              "        {\n" +
              "          \"name\": \"health\",\n" +
              "          \"display_name\": \"health\",\n" +
              "          \"followers\": 11,\n" +
              "          \"total_items\": 2569\n" +
              "        }\n" +
              "      ],\n" +
              "      \"in_most_viral\": true\n" +
              "    },\n" +
              "    {\n" +
              "      \"id\": \"4FjCo\",\n" +
              "      \"title\": \"Lookin at you, Frank\",\n" +
              "      \"description\": null,\n" +
              "      \"datetime\": 1491833331,\n" +
              "      \"cover\": \"oRWiEKC\",\n" +
              "      \"cover_width\": 1306,\n" +
              "      \"cover_height\": 960,\n" +
              "      \"account_url\": \"ExPopeBenedict\",\n" +
              "      \"account_id\": 17054090,\n" +
              "      \"privacy\": \"public\",\n" +
              "      \"layout\": \"blog\",\n" +
              "      \"views\": 135030,\n" +
              "      \"link\": \"http://imgur.com/a/4FjCo\",\n" +
              "      \"ups\": 3321,\n" +
              "      \"downs\": 172,\n" +
              "      \"points\": 3149,\n" +
              "      \"score\": 3149,\n" +
              "      \"is_album\": true,\n" +
              "      \"vote\": null,\n" +
              "      \"favorite\": false,\n" +
              "      \"nsfw\": false,\n" +
              "      \"section\": \"\",\n" +
              "      \"comment_count\": 324,\n" +
              "      \"topic\": \"No Topic\",\n" +
              "      \"topic_id\": 29,\n" +
              "      \"images_count\": 1,\n" +
              "      \"in_gallery\": true,\n" +
              "      \"is_ad\": false,\n" +
              "      \"tags\": [],\n" +
              "      \"in_most_viral\": true\n" +
              "    },\n" +
              "    {\n" +
              "      \"id\": \"593ar\",\n" +
              "      \"title\": \"Half a dump\",\n" +
              "      \"description\": null,\n" +
              "      \"datetime\": 1491823050,\n" +
              "      \"cover\": \"yVnrtDC\",\n" +
              "      \"cover_width\": 374,\n" +
              "      \"cover_height\": 304,\n" +
              "      \"account_url\": \"colonelpanic42\",\n" +
              "      \"account_id\": 33137431,\n" +
              "      \"privacy\": \"hidden\",\n" +
              "      \"layout\": \"blog\",\n" +
              "      \"views\": 235808,\n" +
              "      \"link\": \"http://imgur.com/a/593ar\",\n" +
              "      \"ups\": 5572,\n" +
              "      \"downs\": 265,\n" +
              "      \"points\": 5307,\n" +
              "      \"score\": 5307,\n" +
              "      \"is_album\": true,\n" +
              "      \"vote\": null,\n" +
              "      \"favorite\": false,\n" +
              "      \"nsfw\": false,\n" +
              "      \"section\": \"\",\n" +
              "      \"comment_count\": 179,\n" +
              "      \"topic\": \"No Topic\",\n" +
              "      \"topic_id\": 29,\n" +
              "      \"images_count\": 27,\n" +
              "      \"in_gallery\": true,\n" +
              "      \"is_ad\": false,\n" +
              "      \"tags\": [\n" +
              "        {\n" +
              "          \"name\": \"funny\",\n" +
              "          \"display_name\": \"funny\",\n" +
              "          \"followers\": 2611,\n" +
              "          \"total_items\": 358293\n" +
              "        },\n" +
              "        {\n" +
              "          \"name\": \"memes\",\n" +
              "          \"display_name\": \"memes\",\n" +
              "          \"followers\": 584,\n" +
              "          \"total_items\": 230803\n" +
              "        },\n" +
              "        {\n" +
              "          \"name\": \"dump\",\n" +
              "          \"display_name\": \"dump\",\n" +
              "          \"followers\": 203,\n" +
              "          \"total_items\": 667\n" +
              "        }\n" +
              "      ],\n" +
              "      \"in_most_viral\": true\n" +
              "    },\n" +
              "    {\n" +
              "      \"id\": \"a31Lp\",\n" +
              "      \"title\": \"Early morning conversation.\",\n" +
              "      \"description\": null,\n" +
              "      \"datetime\": 1491837961,\n" +
              "      \"cover\": \"OvVAm0l\",\n" +
              "      \"cover_width\": 722,\n" +
              "      \"cover_height\": 493,\n" +
              "      \"account_url\": \"CaptainYossarian92\",\n" +
              "      \"account_id\": 18394362,\n" +
              "      \"privacy\": \"hidden\",\n" +
              "      \"layout\": \"blog\",\n" +
              "      \"views\": 98556,\n" +
              "      \"link\": \"http://imgur.com/a/a31Lp\",\n" +
              "      \"ups\": 2468,\n" +
              "      \"downs\": 77,\n" +
              "      \"points\": 2391,\n" +
              "      \"score\": 2391,\n" +
              "      \"is_album\": true,\n" +
              "      \"vote\": null,\n" +
              "      \"favorite\": false,\n" +
              "      \"nsfw\": false,\n" +
              "      \"section\": \"\",\n" +
              "      \"comment_count\": 144,\n" +
              "      \"topic\": \"No Topic\",\n" +
              "      \"topic_id\": 29,\n" +
              "      \"images_count\": 7,\n" +
              "      \"in_gallery\": true,\n" +
              "      \"is_ad\": false,\n" +
              "      \"tags\": [\n" +
              "        {\n" +
              "          \"name\": \"funny\",\n" +
              "          \"display_name\": \"funny\",\n" +
              "          \"followers\": 2611,\n" +
              "          \"total_items\": 358293\n" +
              "        },\n" +
              "        {\n" +
              "          \"name\": \"facebook\",\n" +
              "          \"display_name\": \"facebook\",\n" +
              "          \"followers\": 19,\n" +
              "          \"total_items\": 4171\n" +
              "        },\n" +
              "        {\n" +
              "          \"name\": \"hamster\",\n" +
              "          \"display_name\": \"hamster\",\n" +
              "          \"followers\": 1,\n" +
              "          \"total_items\": 460\n" +
              "        }\n" +
              "      ],\n" +
              "      \"in_most_viral\": true\n" +
              "    },\n" +
              "    {\n" +
              "      \"id\": \"kDkZMia\",\n" +
              "      \"title\": \"It's the small things in life\",\n" +
              "      \"description\": \"I live in the UK so will able to drink, get alcohol poisoning, end up in hospital for a few days (for free) and then go to Uni on monday with no one batting an eye lid. Feels good.\\n\\nFront page edit: Yay! I made it. Woooooo!!..... Send nudes or something cuz I'm now an adult and apparently this is what people do.\",\n" +
              "      \"datetime\": 1491849154,\n" +
              "      \"type\": \"image/png\",\n" +
              "      \"animated\": false,\n" +
              "      \"width\": 500,\n" +
              "      \"height\": 500,\n" +
              "      \"size\": 235419,\n" +
              "      \"views\": 44900,\n" +
              "      \"bandwidth\": 10570313100,\n" +
              "      \"vote\": null,\n" +
              "      \"favorite\": false,\n" +
              "      \"nsfw\": false,\n" +
              "      \"section\": \"\",\n" +
              "      \"account_url\": \"w1dget\",\n" +
              "      \"account_id\": 34196254,\n" +
              "      \"is_ad\": false,\n" +
              "      \"tags\": [\n" +
              "        {\n" +
              "          \"name\": \"funny\",\n" +
              "          \"display_name\": \"funny\",\n" +
              "          \"followers\": 2611,\n" +
              "          \"total_items\": 358293\n" +
              "        },\n" +
              "        {\n" +
              "          \"name\": \"true_story\",\n" +
              "          \"display_name\": \"true story\",\n" +
              "          \"followers\": 0,\n" +
              "          \"total_items\": 498\n" +
              "        },\n" +
              "        {\n" +
              "          \"name\": \"im_not_kidding\",\n" +
              "          \"display_name\": \"im not kidding\",\n" +
              "          \"followers\": 0,\n" +
              "          \"total_items\": 1\n" +
              "        },\n" +
              "        {\n" +
              "          \"name\": \"i_ended_up_in_hospital_for_6_hours\",\n" +
              "          \"display_name\": \"i ended up in hospital for 6 hours\",\n" +
              "          \"followers\": 0,\n" +
              "          \"total_items\": 0\n" +
              "        },\n" +
              "        {\n" +
              "          \"name\": \"cuz_i_almost_drank_myself_to_death\",\n" +
              "          \"display_name\": \"cuz i almost drank myself to death\",\n" +
              "          \"followers\": 0,\n" +
              "          \"total_items\": 0\n" +
              "        }\n" +
              "      ],\n" +
              "      \"in_most_viral\": true,\n" +
              "      \"in_gallery\": true,\n" +
              "      \"topic\": \"No Topic\",\n" +
              "      \"topic_id\": 29,\n" +
              "      \"link\": \"http://i.imgur.com/kDkZMia.png\",\n" +
              "      \"comment_count\": 167,\n" +
              "      \"ups\": 1425,\n" +
              "      \"downs\": 85,\n" +
              "      \"points\": 1340,\n" +
              "      \"score\": 1362,\n" +
              "      \"is_album\": false\n" +
              "    },\n" +
              "    {\n" +
              "      \"id\": \"256FA\",\n" +
              "      \"title\": \"Boy raised as girl\",\n" +
              "      \"description\": null,\n" +
              "      \"datetime\": 1491848956,\n" +
              "      \"cover\": \"xpr6yAG\",\n" +
              "      \"cover_width\": 620,\n" +
              "      \"cover_height\": 330,\n" +
              "      \"account_url\": \"ProvidesYouNewShittyLinks\",\n" +
              "      \"account_id\": 25784455,\n" +
              "      \"privacy\": \"hidden\",\n" +
              "      \"layout\": \"blog\",\n" +
              "      \"views\": 45380,\n" +
              "      \"link\": \"http://imgur.com/a/256FA\",\n" +
              "      \"ups\": 1395,\n" +
              "      \"downs\": 64,\n" +
              "      \"points\": 1331,\n" +
              "      \"score\": 1331,\n" +
              "      \"is_album\": true,\n" +
              "      \"vote\": null,\n" +
              "      \"favorite\": false,\n" +
              "      \"nsfw\": false,\n" +
              "      \"section\": \"\",\n" +
              "      \"comment_count\": 364,\n" +
              "      \"topic\": \"No Topic\",\n" +
              "      \"topic_id\": 29,\n" +
              "      \"images_count\": 1,\n" +
              "      \"in_gallery\": true,\n" +
              "      \"is_ad\": false,\n" +
              "      \"tags\": [],\n" +
              "      \"in_most_viral\": true\n" +
              "    },\n" +
              "    {\n" +
              "      \"id\": \"28p20VP\",\n" +
              "      \"title\": \"Randomly selected United Airlines passenger assaulted and dragged off overbooked flight\",\n" +
              "      \"description\": null,\n" +
              "      \"datetime\": 1491848199,\n" +
              "      \"type\": \"image/gif\",\n" +
              "      \"animated\": true,\n" +
              "      \"width\": 405,\n" +
              "      \"height\": 720,\n" +
              "      \"size\": 39240825,\n" +
              "      \"views\": 179791,\n" +
              "      \"bandwidth\": 7055147167575,\n" +
              "      \"vote\": null,\n" +
              "      \"favorite\": false,\n" +
              "      \"nsfw\": false,\n" +
              "      \"section\": \"\",\n" +
              "      \"account_url\": \"textfile\",\n" +
              "      \"account_id\": 7924180,\n" +
              "      \"is_ad\": false,\n" +
              "      \"tags\": [\n" +
              "        {\n" +
              "          \"name\": \"united_airlines\",\n" +
              "          \"display_name\": \"united airlines\",\n" +
              "          \"followers\": 0,\n" +
              "          \"total_items\": 22\n" +
              "        }\n" +
              "      ],\n" +
              "      \"in_most_viral\": true,\n" +
              "      \"in_gallery\": true,\n" +
              "      \"topic\": \"No Topic\",\n" +
              "      \"topic_id\": 29,\n" +
              "      \"mp4\": \"http://i.imgur.com/28p20VP.mp4\",\n" +
              "      \"gifv\": \"http://i.imgur.com/28p20VP.gifv\",\n" +
              "      \"mp4_size\": 6648680,\n" +
              "      \"link\": \"http://i.imgur.com/28p20VPh.gif\",\n" +
              "      \"looping\": true,\n" +
              "      \"comment_count\": 543,\n" +
              "      \"ups\": 1432,\n" +
              "      \"downs\": 76,\n" +
              "      \"points\": 1356,\n" +
              "      \"score\": 1445,\n" +
              "      \"is_album\": false\n" +
              "    },\n" +
              "    {\n" +
              "      \"id\": \"cJtqM\",\n" +
              "      \"title\": \"'Wolves' by Joseph Capehart\",\n" +
              "      \"description\": null,\n" +
              "      \"datetime\": 1491836630,\n" +
              "      \"cover\": \"zhqQ9tf\",\n" +
              "      \"cover_width\": 1272,\n" +
              "      \"cover_height\": 677,\n" +
              "      \"account_url\": \"captaingibbs\",\n" +
              "      \"account_id\": 13716309,\n" +
              "      \"privacy\": \"hidden\",\n" +
              "      \"layout\": \"blog\",\n" +
              "      \"views\": 105577,\n" +
              "      \"link\": \"http://imgur.com/a/cJtqM\",\n" +
              "      \"ups\": 2544,\n" +
              "      \"downs\": 110,\n" +
              "      \"points\": 2434,\n" +
              "      \"score\": 2434,\n" +
              "      \"is_album\": true,\n" +
              "      \"vote\": null,\n" +
              "      \"favorite\": false,\n" +
              "      \"nsfw\": false,\n" +
              "      \"section\": \"\",\n" +
              "      \"comment_count\": 146,\n" +
              "      \"topic\": \"No Topic\",\n" +
              "      \"topic_id\": 29,\n" +
              "      \"images_count\": 27,\n" +
              "      \"in_gallery\": true,\n" +
              "      \"is_ad\": false,\n" +
              "      \"tags\": [\n" +
              "        {\n" +
              "          \"name\": \"poetry\",\n" +
              "          \"display_name\": \"poetry\",\n" +
              "          \"followers\": 12,\n" +
              "          \"total_items\": 725\n" +
              "        },\n" +
              "        {\n" +
              "          \"name\": \"storytime\",\n" +
              "          \"display_name\": \"storytime\",\n" +
              "          \"followers\": 9,\n" +
              "          \"total_items\": 603\n" +
              "        },\n" +
              "        {\n" +
              "          \"name\": \"spoken_word\",\n" +
              "          \"display_name\": \"spoken word\",\n" +
              "          \"followers\": 0,\n" +
              "          \"total_items\": 6\n" +
              "        },\n" +
              "        {\n" +
              "          \"name\": \"slam_poetry\",\n" +
              "          \"display_name\": \"slam poetry\",\n" +
              "          \"followers\": 0,\n" +
              "          \"total_items\": 5\n" +
              "        }\n" +
              "      ],\n" +
              "      \"in_most_viral\": true\n" +
              "    },\n" +
              "    {\n" +
              "      \"id\": \"f1ukJ\",\n" +
              "      \"title\": \"MRW when you see a co-worker at a midnight bar\",\n" +
              "      \"description\": null,\n" +
              "      \"datetime\": 1491840881,\n" +
              "      \"cover\": \"mR946XC\",\n" +
              "      \"cover_width\": 500,\n" +
              "      \"cover_height\": 194,\n" +
              "      \"account_url\": \"MRWOPmakesyoulook\",\n" +
              "      \"account_id\": 38340920,\n" +
              "      \"privacy\": \"public\",\n" +
              "      \"layout\": \"blog\",\n" +
              "      \"views\": 79868,\n" +
              "      \"link\": \"http://imgur.com/a/f1ukJ\",\n" +
              "      \"ups\": 1937,\n" +
              "      \"downs\": 62,\n" +
              "      \"points\": 1875,\n" +
              "      \"score\": 1875,\n" +
              "      \"is_album\": true,\n" +
              "      \"vote\": null,\n" +
              "      \"favorite\": false,\n" +
              "      \"nsfw\": false,\n" +
              "      \"section\": \"\",\n" +
              "      \"comment_count\": 177,\n" +
              "      \"topic\": \"No Topic\",\n" +
              "      \"topic_id\": 29,\n" +
              "      \"images_count\": 3,\n" +
              "      \"in_gallery\": true,\n" +
              "      \"is_ad\": false,\n" +
              "      \"tags\": [\n" +
              "        {\n" +
              "          \"name\": \"funny\",\n" +
              "          \"display_name\": \"funny\",\n" +
              "          \"followers\": 2611,\n" +
              "          \"total_items\": 358293\n" +
              "        },\n" +
              "        {\n" +
              "          \"name\": \"gif\",\n" +
              "          \"display_name\": \"gif\",\n" +
              "          \"followers\": 653,\n" +
              "          \"total_items\": 53982\n" +
              "        },\n" +
              "        {\n" +
              "          \"name\": \"mrw\",\n" +
              "          \"display_name\": \"mrw\",\n" +
              "          \"followers\": 39,\n" +
              "          \"total_items\": 10785\n" +
              "        },\n" +
              "        {\n" +
              "          \"name\": \"thor\",\n" +
              "          \"display_name\": \"thor\",\n" +
              "          \"followers\": 6,\n" +
              "          \"total_items\": 538\n" +
              "        },\n" +
              "        {\n" +
              "          \"name\": \"ragnorak\",\n" +
              "          \"display_name\": \"ragnorak\",\n" +
              "          \"followers\": 0,\n" +
              "          \"total_items\": 0\n" +
              "        }\n" +
              "      ],\n" +
              "      \"in_most_viral\": true\n" +
              "    },\n" +
              "    {\n" +
              "      \"id\": \"qFjS4\",\n" +
              "      \"title\": \"Any love for Hank Azaria?\",\n" +
              "      \"description\": \"Honorable mentions: ALL OF HIS MAJESTIC VOICEWORK. These are JUST his Simpsons characters!\\n\\nCool kid\\nRex\\nMoe Szyslak\\nApu Nahasapeemapetilon\\nChief Wiggum\\nDr. Nick Riviera\\nDr. Brentano\\nDr. Hibbert's First Son\\nBruno Drundridge\\nDr. Egoyan\\nBud Armstrong\\nAT-AT\\nBomb Disarming Robot\\nComic Book Guy\\nCarl Carlson\\nProfessor Frink\\nCletus Spuckler\\nSnake\\nLou\\nKirk Van Houten\\nHoratio McCallister\\nDisco Stu\\nSuperintendent Chalmers\\nDuffman\\nWiseguy\\nBumblebee Man\\nDrederick Tatum\\nFrank Grimes\\nFrank Grimes, Jr.\\nJohnny Tightlips\\nRoofi\\nCubby\\nBaby Gerald\\nMale EPA Worker\\nRich Depot Announcer\\nCarnival Barker\\nCounter Man\\nEPA Passenger\\nRobot\\nSir Widebottom\\nHomer's Organizer\\nThe Zorro\\nMan in the Iron Mask\\nMovie Credit Rapper\\nDefendant\\nTruck Driver\\nMr. Sakamoto\\nTaxi Driver\\nGatekeeper\\nJockey 1\\nJockey 3\\nMike Jambowski\\nCyborganizer\\nSmall Robot\\nMexican Milhouse\\nThai Man\\nMaitre D'\\nSalesman\\nTerrorist\\nYiddisha Guy\\nFireman at Bachelor Auction\\nRetirement Castle Worker\\nApu's Relative at Wedding\\nTooth Chipper Operator\\nGarbage Man\\nFleet-A-Pita Chef\\nSandwick Delivery Guy\\nSenior Dance Instructor\\nAnnual Gift Man\\nT-shirts Vendor\\nComa Patient\\nShelbyville Milhouse\\nSnake's Brother\\nWax Lips Man\\nCredits\",\n" +
              "      \"datetime\": 1491848506,\n" +
              "      \"cover\": \"Xs21cAE\",\n" +
              "      \"cover_width\": 960,\n" +
              "      \"cover_height\": 540,\n" +
              "      \"account_url\": \"BabyFarkMcGeeZax\",\n" +
              "      \"account_id\": 55344233,\n" +
              "      \"privacy\": \"public\",\n" +
              "      \"layout\": \"blog\",\n" +
              "      \"views\": 50020,\n" +
              "      \"link\": \"http://imgur.com/a/qFjS4\",\n" +
              "      \"ups\": 1321,\n" +
              "      \"downs\": 56,\n" +
              "      \"points\": 1265,\n" +
              "      \"score\": 1265,\n" +
              "      \"is_album\": true,\n" +
              "      \"vote\": null,\n" +
              "      \"favorite\": false,\n" +
              "      \"nsfw\": false,\n" +
              "      \"section\": \"\",\n" +
              "      \"comment_count\": 208,\n" +
              "      \"topic\": \"No Topic\",\n" +
              "      \"topic_id\": 29,\n" +
              "      \"images_count\": 25,\n" +
              "      \"in_gallery\": true,\n" +
              "      \"is_ad\": false,\n" +
              "      \"tags\": [\n" +
              "        {\n" +
              "          \"name\": \"legendary\",\n" +
              "          \"display_name\": \"legendary\",\n" +
              "          \"followers\": 0,\n" +
              "          \"total_items\": 111\n" +
              "        },\n" +
              "        {\n" +
              "          \"name\": \"the_birdcage\",\n" +
              "          \"display_name\": \"the birdcage\",\n" +
              "          \"followers\": 0,\n" +
              "          \"total_items\": 3\n" +
              "        },\n" +
              "        {\n" +
              "          \"name\": \"hank_azaria\",\n" +
              "          \"display_name\": \"hank azaria\",\n" +
              "          \"followers\": 0,\n" +
              "          \"total_items\": 2\n" +
              "        },\n" +
              "        {\n" +
              "          \"name\": \"blue_raja\",\n" +
              "          \"display_name\": \"blue raja\",\n" +
              "          \"followers\": 0,\n" +
              "          \"total_items\": 0\n" +
              "        },\n" +
              "        {\n" +
              "          \"name\": \"patches_o_houlihan\",\n" +
              "          \"display_name\": \"patches o houlihan\",\n" +
              "          \"followers\": 0,\n" +
              "          \"total_items\": 0\n" +
              "        }\n" +
              "      ],\n" +
              "      \"in_most_viral\": true\n" +
              "    },\n" +
              "    {\n" +
              "      \"id\": \"87CYilg\",\n" +
              "      \"title\": \"Load your trailer carefully\",\n" +
              "      \"description\": null,\n" +
              "      \"datetime\": 1491829291,\n" +
              "      \"type\": \"image/gif\",\n" +
              "      \"animated\": true,\n" +
              "      \"width\": 720,\n" +
              "      \"height\": 720,\n" +
              "      \"size\": 25597288,\n" +
              "      \"views\": 484464,\n" +
              "      \"bandwidth\": 12400964533632,\n" +
              "      \"vote\": null,\n" +
              "      \"favorite\": false,\n" +
              "      \"nsfw\": false,\n" +
              "      \"section\": \"boating\",\n" +
              "      \"account_url\": \"iwasdoingfinelurking\",\n" +
              "      \"account_id\": 53218393,\n" +
              "      \"is_ad\": false,\n" +
              "      \"tags\": [],\n" +
              "      \"in_most_viral\": true,\n" +
              "      \"in_gallery\": true,\n" +
              "      \"topic\": \"No Topic\",\n" +
              "      \"topic_id\": 29,\n" +
              "      \"mp4\": \"http://i.imgur.com/87CYilg.mp4\",\n" +
              "      \"gifv\": \"http://i.imgur.com/87CYilg.gifv\",\n" +
              "      \"mp4_size\": 1596412,\n" +
              "      \"link\": \"http://i.imgur.com/87CYilgh.gif\",\n" +
              "      \"looping\": true,\n" +
              "      \"comment_count\": 166,\n" +
              "      \"ups\": 3464,\n" +
              "      \"downs\": 104,\n" +
              "      \"points\": 3360,\n" +
              "      \"score\": 3602,\n" +
              "      \"is_album\": false\n" +
              "    },\n" +
              "    {\n" +
              "      \"id\": \"xLwkGWi\",\n" +
              "      \"title\": \"Halle Berry's magnum opus\",\n" +
              "      \"description\": \"Fact #1: it looked really dumb so I never bothered to see it.\",\n" +
              "      \"datetime\": 1491846792,\n" +
              "      \"type\": \"image/png\",\n" +
              "      \"animated\": false,\n" +
              "      \"width\": 610,\n" +
              "      \"height\": 610,\n" +
              "      \"size\": 594228,\n" +
              "      \"views\": 58070,\n" +
              "      \"bandwidth\": 34506819960,\n" +
              "      \"vote\": null,\n" +
              "      \"favorite\": false,\n" +
              "      \"nsfw\": false,\n" +
              "      \"section\": \"\",\n" +
              "      \"account_url\": \"BlakeNorthcott\",\n" +
              "      \"account_id\": 15471411,\n" +
              "      \"is_ad\": false,\n" +
              "      \"tags\": [\n" +
              "        {\n" +
              "          \"name\": \"catwoman\",\n" +
              "          \"display_name\": \"catwoman\",\n" +
              "          \"followers\": 3,\n" +
              "          \"total_items\": 150\n" +
              "        }\n" +
              "      ],\n" +
              "      \"in_most_viral\": true,\n" +
              "      \"in_gallery\": true,\n" +
              "      \"topic\": \"No Topic\",\n" +
              "      \"topic_id\": 29,\n" +
              "      \"link\": \"http://i.imgur.com/xLwkGWi.png\",\n" +
              "      \"comment_count\": 131,\n" +
              "      \"ups\": 1454,\n" +
              "      \"downs\": 92,\n" +
              "      \"points\": 1362,\n" +
              "      \"score\": 1390,\n" +
              "      \"is_album\": false\n" +
              "    },\n" +
              "    {\n" +
              "      \"id\": \"tNcLK\",\n" +
              "      \"title\": \"Made me laugh then cry\",\n" +
              "      \"description\": null,\n" +
              "      \"datetime\": 1491839273,\n" +
              "      \"cover\": \"HrfnQUR\",\n" +
              "      \"cover_width\": 673,\n" +
              "      \"cover_height\": 497,\n" +
              "      \"account_url\": \"HenriATT\",\n" +
              "      \"account_id\": 27486245,\n" +
              "      \"privacy\": \"hidden\",\n" +
              "      \"layout\": \"blog\",\n" +
              "      \"views\": 70209,\n" +
              "      \"link\": \"http://imgur.com/a/tNcLK\",\n" +
              "      \"ups\": 2070,\n" +
              "      \"downs\": 71,\n" +
              "      \"points\": 1999,\n" +
              "      \"score\": 1999,\n" +
              "      \"is_album\": true,\n" +
              "      \"vote\": null,\n" +
              "      \"favorite\": false,\n" +
              "      \"nsfw\": false,\n" +
              "      \"section\": \"\",\n" +
              "      \"comment_count\": 75,\n" +
              "      \"topic\": \"No Topic\",\n" +
              "      \"topic_id\": 29,\n" +
              "      \"images_count\": 1,\n" +
              "      \"in_gallery\": true,\n" +
              "      \"is_ad\": false,\n" +
              "      \"tags\": [\n" +
              "        {\n" +
              "          \"name\": \"united_airlines\",\n" +
              "          \"display_name\": \"united airlines\",\n" +
              "          \"followers\": 0,\n" +
              "          \"total_items\": 22\n" +
              "        }\n" +
              "      ],\n" +
              "      \"in_most_viral\": true\n" +
              "    },\n" +
              "    {\n" +
              "      \"id\": \"q3Y19\",\n" +
              "      \"title\": \"In an alternate universe...\",\n" +
              "      \"description\": null,\n" +
              "      \"datetime\": 1491830050,\n" +
              "      \"cover\": \"t0Fmrxb\",\n" +
              "      \"cover_width\": 1377,\n" +
              "      \"cover_height\": 913,\n" +
              "      \"account_url\": \"PrinceDoran\",\n" +
              "      \"account_id\": 20112768,\n" +
              "      \"privacy\": \"hidden\",\n" +
              "      \"layout\": \"blog\",\n" +
              "      \"views\": 156607,\n" +
              "      \"link\": \"http://imgur.com/a/q3Y19\",\n" +
              "      \"ups\": 3399,\n" +
              "      \"downs\": 221,\n" +
              "      \"points\": 3178,\n" +
              "      \"score\": 3178,\n" +
              "      \"is_album\": true,\n" +
              "      \"vote\": null,\n" +
              "      \"favorite\": false,\n" +
              "      \"nsfw\": false,\n" +
              "      \"section\": \"rickandmorty\",\n" +
              "      \"comment_count\": 89,\n" +
              "      \"topic\": \"No Topic\",\n" +
              "      \"topic_id\": 29,\n" +
              "      \"images_count\": 1,\n" +
              "      \"in_gallery\": true,\n" +
              "      \"is_ad\": false,\n" +
              "      \"tags\": [\n" +
              "        {\n" +
              "          \"name\": \"funny\",\n" +
              "          \"display_name\": \"funny\",\n" +
              "          \"followers\": 2611,\n" +
              "          \"total_items\": 358293\n" +
              "        },\n" +
              "        {\n" +
              "          \"name\": \"rick_and_morty\",\n" +
              "          \"display_name\": \"rick and morty\",\n" +
              "          \"followers\": 68,\n" +
              "          \"total_items\": 2040\n" +
              "        }\n" +
              "      ],\n" +
              "      \"in_most_viral\": true\n" +
              "    },\n" +
              "    {\n" +
              "      \"id\": \"cFU8J\",\n" +
              "      \"title\": \"Stock Video Stories (Part 6)\",\n" +
              "      \"description\": null,\n" +
              "      \"datetime\": 1491849275,\n" +
              "      \"cover\": \"KF9Bpzr\",\n" +
              "      \"cover_width\": 400,\n" +
              "      \"cover_height\": 226,\n" +
              "      \"account_url\": \"LOLNEIN\",\n" +
              "      \"account_id\": 6083583,\n" +
              "      \"privacy\": \"hidden\",\n" +
              "      \"layout\": \"blog\",\n" +
              "      \"views\": 49484,\n" +
              "      \"link\": \"http://imgur.com/a/cFU8J\",\n" +
              "      \"ups\": 1208,\n" +
              "      \"downs\": 36,\n" +
              "      \"points\": 1172,\n" +
              "      \"score\": 1172,\n" +
              "      \"is_album\": true,\n" +
              "      \"vote\": null,\n" +
              "      \"favorite\": false,\n" +
              "      \"nsfw\": false,\n" +
              "      \"section\": \"\",\n" +
              "      \"comment_count\": 36,\n" +
              "      \"topic\": \"No Topic\",\n" +
              "      \"topic_id\": 29,\n" +
              "      \"images_count\": 5,\n" +
              "      \"in_gallery\": true,\n" +
              "      \"is_ad\": false,\n" +
              "      \"tags\": [],\n" +
              "      \"in_most_viral\": true\n" +
              "    },\n" +
              "    {\n" +
              "      \"id\": \"YVJb7\",\n" +
              "      \"title\": \"Thor vs Hulk high quality \",\n" +
              "      \"description\": null,\n" +
              "      \"datetime\": 1491831633,\n" +
              "      \"cover\": \"YrOpBYq\",\n" +
              "      \"cover_width\": 960,\n" +
              "      \"cover_height\": 400,\n" +
              "      \"account_url\": \"uhdgifs\",\n" +
              "      \"account_id\": 55652609,\n" +
              "      \"privacy\": \"public\",\n" +
              "      \"layout\": \"blog\",\n" +
              "      \"views\": 136010,\n" +
              "      \"link\": \"http://imgur.com/a/YVJb7\",\n" +
              "      \"ups\": 2820,\n" +
              "      \"downs\": 87,\n" +
              "      \"points\": 2733,\n" +
              "      \"score\": 2733,\n" +
              "      \"is_album\": true,\n" +
              "      \"vote\": null,\n" +
              "      \"favorite\": false,\n" +
              "      \"nsfw\": false,\n" +
              "      \"section\": \"\",\n" +
              "      \"comment_count\": 347,\n" +
              "      \"topic\": \"No Topic\",\n" +
              "      \"topic_id\": 29,\n" +
              "      \"images_count\": 1,\n" +
              "      \"in_gallery\": true,\n" +
              "      \"is_ad\": false,\n" +
              "      \"tags\": [\n" +
              "        {\n" +
              "          \"name\": \"awesome\",\n" +
              "          \"display_name\": \"awesome\",\n" +
              "          \"followers\": 129,\n" +
              "          \"total_items\": 29114\n" +
              "        }\n" +
              "      ],\n" +
              "      \"in_most_viral\": true\n" +
              "    },\n" +
              "    {\n" +
              "      \"id\": \"oAsYs\",\n" +
              "      \"title\": \"Stock Video Stories (Part 4)\",\n" +
              "      \"description\": null,\n" +
              "      \"datetime\": 1491821734,\n" +
              "      \"cover\": \"ki8YEuk\",\n" +
              "      \"cover_width\": 400,\n" +
              "      \"cover_height\": 225,\n" +
              "      \"account_url\": \"LOLNEIN\",\n" +
              "      \"account_id\": 6083583,\n" +
              "      \"privacy\": \"hidden\",\n" +
              "      \"layout\": \"blog\",\n" +
              "      \"views\": 230569,\n" +
              "      \"link\": \"http://imgur.com/a/oAsYs\",\n" +
              "      \"ups\": 4614,\n" +
              "      \"downs\": 116,\n" +
              "      \"points\": 4498,\n" +
              "      \"score\": 4498,\n" +
              "      \"is_album\": true,\n" +
              "      \"vote\": null,\n" +
              "      \"favorite\": false,\n" +
              "      \"nsfw\": false,\n" +
              "      \"section\": \"\",\n" +
              "      \"comment_count\": 93,\n" +
              "      \"topic\": \"No Topic\",\n" +
              "      \"topic_id\": 29,\n" +
              "      \"images_count\": 5,\n" +
              "      \"in_gallery\": true,\n" +
              "      \"is_ad\": false,\n" +
              "      \"tags\": [],\n" +
              "      \"in_most_viral\": true\n" +
              "    },\n" +
              "    {\n" +
              "      \"id\": \"tvJJouT\",\n" +
              "      \"title\": \"Knock knock mother fcker\",\n" +
              "      \"description\": \"Donald be like .\",\n" +
              "      \"datetime\": 1491835470,\n" +
              "      \"type\": \"image/gif\",\n" +
              "      \"animated\": true,\n" +
              "      \"width\": 460,\n" +
              "      \"height\": 258,\n" +
              "      \"size\": 2800943,\n" +
              "      \"views\": 287075,\n" +
              "      \"bandwidth\": 804080711725,\n" +
              "      \"vote\": null,\n" +
              "      \"favorite\": false,\n" +
              "      \"nsfw\": false,\n" +
              "      \"section\": \"gifs\",\n" +
              "      \"account_url\": \"Barble\",\n" +
              "      \"account_id\": 58291137,\n" +
              "      \"is_ad\": false,\n" +
              "      \"tags\": [\n" +
              "        {\n" +
              "          \"name\": \"funny\",\n" +
              "          \"display_name\": \"funny\",\n" +
              "          \"followers\": 2611,\n" +
              "          \"total_items\": 358293\n" +
              "        }\n" +
              "      ],\n" +
              "      \"in_most_viral\": true,\n" +
              "      \"in_gallery\": true,\n" +
              "      \"topic\": \"No Topic\",\n" +
              "      \"topic_id\": 29,\n" +
              "      \"mp4\": \"http://i.imgur.com/tvJJouT.mp4\",\n" +
              "      \"gifv\": \"http://i.imgur.com/tvJJouT.gifv\",\n" +
              "      \"mp4_size\": 124619,\n" +
              "      \"link\": \"http://i.imgur.com/tvJJouT.gif\",\n" +
              "      \"looping\": true,\n" +
              "      \"comment_count\": 650,\n" +
              "      \"ups\": 2380,\n" +
              "      \"downs\": 196,\n" +
              "      \"points\": 2184,\n" +
              "      \"score\": 2327,\n" +
              "      \"is_album\": false\n" +
              "    }\n" +
              "  ],\n" +
              "  \"success\": true,\n" +
              "  \"status\": 200\n" +
              "}\n";
    }

    @Override
    public Observable<ImgurResults> fetchImgurImagesWith(@Path("section") String section,
                                                         @Path("sort") String sort,
                                                         @Path("window") String window,
                                                         @Path("page") Integer page,
                                                         @Query("showViral") boolean bool) {
        return null;
    }
}
