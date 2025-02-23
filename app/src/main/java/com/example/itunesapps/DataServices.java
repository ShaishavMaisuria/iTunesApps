package com.example.itunesapps;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class DataServices {
    private static HashMap<String, Account> authTokenAccountsMap = new HashMap<String, Account>(){{
        put(UUID.randomUUID().toString(), new Account("Alice Smith", "a@a.com", "test123"));
        put(UUID.randomUUID().toString(), new Account("Bob Smith", "b@b.com", "test123"));
        put(UUID.randomUUID().toString(), new Account("Charles Smith", "c@c.com", "test123"));
    }};

    private static final HashMap<String, ArrayList<App>> apps= new HashMap<String, ArrayList<App>>(){{
        put("Top Free Apps", new ArrayList<App>(){{
            add(new App(new ArrayList<String>(Arrays.asList("Entertainment","Social Networking")),"1510177719","1508067409","Qianyun Zhao","https://is1-ssl.mzstatic.com/image/thumb/Purple113/v4/f2/0a/0d/f20a0d26-d8cf-d55f-5370-be56080d7188/AppIcon-1x_U007emarketing-0-7-0-0-85-220.png/200x200bb.png","Zynn","2020-05-06","https://apps.apple.com/us/app/zynn/id1510177719"));
            add(new App(new ArrayList<String>(Arrays.asList("Business","Productivity")),"546505307","530594111","Zoom","https://is3-ssl.mzstatic.com/image/thumb/Purple114/v4/e7/e8/eb/e7e8eb72-8bf8-5288-97e6-9f800d93b423/AppIcon-0-1x_U007emarketing-0-0-85-220-9.png/200x200bb.png","ZOOM Cloud Meetings","2012-08-15","https://apps.apple.com/us/app/zoom-cloud-meetings/id546505307"));
            add(new App(new ArrayList<String>(Arrays.asList("News","Utilities")),"1039889567","1025059472","sp0n, Inc.","https://is1-ssl.mzstatic.com/image/thumb/Purple123/v4/4c/c3/ee/4cc3ee6c-944a-3d36-9212-e13583837661/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","Citizen: Connect and Stay Safe","2016-02-24","https://apps.apple.com/us/app/citizen-connect-and-stay-safe/id1039889567"));
            add(new App(new ArrayList<String>(Arrays.asList("Utilities","News")),"356336433","323131781","Smartest Apps LLC","https://is2-ssl.mzstatic.com/image/thumb/Purple123/v4/d6/f5/20/d6f520e3-c07c-3d9d-82f1-46c2e9d33a5e/AppIcon-1x_U007emarketing-0-7-85-220.png/200x200bb.png","5-0 Radio Police Scanner","2010-02-18","https://apps.apple.com/us/app/5-0-radio-police-scanner/id356336433"));
            add(new App(new ArrayList<String>(Arrays.asList("Entertainment","Photo & Video")),"835599320","1039610913","TikTok Inc.","https://is1-ssl.mzstatic.com/image/thumb/Purple124/v4/9a/b7/5b/9ab75bc8-75db-bb62-383e-1d47190a368d/AppIcon_TikTok-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","TikTok - Make Your Day","2014-04-02","https://apps.apple.com/us/app/tiktok-make-your-day/id835599320"));
            add(new App(new ArrayList<String>(Arrays.asList("News","Entertainment")),"498405045","498405048","GordonEdwards.net LLC","https://is5-ssl.mzstatic.com/image/thumb/Purple123/v4/da/26/63/da266336-5fd1-9bd3-9c75-53258dc039c8/AppIcon-2-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","Police Scanner Radio & Fire","2012-02-05","https://apps.apple.com/us/app/police-scanner-radio-fire/id498405045"));
            add(new App(new ArrayList<String>(Arrays.asList("Photo & Video","Entertainment")),"544007664","281956209","Google LLC","https://is3-ssl.mzstatic.com/image/thumb/Purple113/v4/18/f6/03/18f603a6-1424-c68d-76cf-f54c5a41ebb9/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","YouTube: Watch, Listen, Stream","2012-09-11","https://apps.apple.com/us/app/youtube-watch-listen-stream/id544007664"));
            add(new App(new ArrayList<String>(Arrays.asList("News","Social Networking")),"333903271","296415947","Twitter, Inc.","https://is5-ssl.mzstatic.com/image/thumb/Purple114/v4/bf/96/81/bf968168-052d-2e18-b054-9652fb6f10df/ProductionAppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","Twitter","2009-10-09","https://apps.apple.com/us/app/twitter/id333903271"));
            add(new App(new ArrayList<String>(Arrays.asList("Social Networking")),"284882215","284882218","Facebook, Inc.","https://is5-ssl.mzstatic.com/image/thumb/Purple114/v4/a5/84/64/a58464bc-1dd4-364a-1345-47cd7009bb0c/Icon-Production-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","Facebook","2019-02-05","https://apps.apple.com/us/app/facebook/id284882215"));
            add(new App(new ArrayList<String>(Arrays.asList("Photo & Video","Social Networking")),"389801252","389801255","Instagram, Inc.","https://is4-ssl.mzstatic.com/image/thumb/Purple113/v4/6b/ea/15/6bea1553-35e8-fbf7-aeda-f13e69085221/Prod-0-0-1x_U007emarketing-0-0-0-6-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","Instagram","2010-10-06","https://apps.apple.com/us/app/instagram/id389801252"));
            add(new App(new ArrayList<String>(Arrays.asList("Social Networking","Productivity")),"454638411","284882218","Facebook, Inc.","https://is1-ssl.mzstatic.com/image/thumb/Purple114/v4/2e/68/90/2e68903f-5e90-f452-de90-5d2d13111e8c/Icon-0-0-1x_U007emarketing-0-0-0-7-0-0-85-220.png/200x200bb.png","Messenger","2011-08-09","https://apps.apple.com/us/app/messenger/id454638411"));
            add(new App(new ArrayList<String>(Arrays.asList("Photo & Video","Social Networking")),"447188370","446889612","Snap, Inc.","https://is4-ssl.mzstatic.com/image/thumb/Purple114/v4/3a/e0/44/3ae04417-a244-72c7-c853-85450ba5dd02/AppIcon-0-0-1x_U007emarketing-0-0-0-5-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","Snapchat","2011-07-13","https://apps.apple.com/us/app/snapchat/id447188370"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Simulation","Casual")),"1512017896","1498791995","Binnur Eralp","https://is4-ssl.mzstatic.com/image/thumb/Purple123/v4/ea/0d/dd/ea0ddd2e-afc0-31d7-55f9-203ba8d9df8f/AppIcon-1x_U007emarketing-0-7-0-85-220.png/200x200bb.png","School Kid 3D","2020-05-07","https://apps.apple.com/us/app/school-kid-3d/id1512017896"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Puzzle")),"1504499700","1471130484","Ceyhun Tasci","https://is4-ssl.mzstatic.com/image/thumb/Purple123/v4/ff/ee/30/ffee3052-4e8f-1013-3f04-2efefe38cd8b/AppIcon-1x_U007emarketing-0-7-0-85-220.png/200x200bb.png","Fit It 3D","2020-04-04","https://apps.apple.com/us/app/fit-it-3d/id1504499700"));
            add(new App(new ArrayList<String>(Arrays.asList("Productivity","Social Networking")),"422689480","281956209","Google LLC","https://is1-ssl.mzstatic.com/image/thumb/Purple114/v4/46/37/c8/4637c86b-5c7b-a669-68f0-ba8635f65b45/logo_gmail_color-0-0-1x_U007emarketing-0-0-0-6-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","Gmail - Email by Google","2011-11-02","https://apps.apple.com/us/app/gmail-email-by-google/id422689480"));
            add(new App(new ArrayList<String>(Arrays.asList("Finance","Business")),"711923939","335393791","Square, Inc.","https://is3-ssl.mzstatic.com/image/thumb/Purple114/v4/88/54/42/88544217-121a-cc19-8db6-5c0da87095e1/AppIcon-0-1x_U007emarketing-0-0-GLES2_U002c0-512MB-sRGB-0-0-0-85-220-0-0-0-7.png/200x200bb.png","Cash App","2013-10-16","https://apps.apple.com/us/app/cash-app/id711923939"));
            add(new App(new ArrayList<String>(Arrays.asList("Shopping","Lifestyle")),"297606951","297606954","AMZN Mobile LLC","https://is3-ssl.mzstatic.com/image/thumb/Purple124/v4/c7/8c/de/c78cdeb8-60bc-f3d1-1f2e-41b4b77f81a1/AppIcon-0-1x_U007emarketing-0-0-GLES2_U002c0-512MB-sRGB-0-0-0-85-220-0-0-0-6.png/200x200bb.png","Amazon - Shopping made easy","2008-12-03","https://apps.apple.com/us/app/amazon-shopping-made-easy/id297606951"));
            add(new App(new ArrayList<String>(Arrays.asList("Entertainment","Lifestyle")),"363590051","363590054","Netflix, Inc.","https://is3-ssl.mzstatic.com/image/thumb/Purple124/v4/b5/1d/8c/b51d8c58-fa82-d985-ce62-eda702c33c36/AppIcon-0-0-1x_U007emarketing-0-0-0-10-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","Netflix","2010-04-01","https://apps.apple.com/us/app/netflix/id363590051"));
            add(new App(new ArrayList<String>(Arrays.asList("Shopping")),"878577184","917101494","Shein Group Ltd","https://is5-ssl.mzstatic.com/image/thumb/Purple114/v4/a4/d2/b8/a4d2b834-4d92-62e8-129c-3e7f61bf2ab8/AppIcon-0-1x_U007emarketing-0-0-85-220-0-10.png/200x200bb.png","SHEIN-Fashion Shopping Online","2014-05-20","https://apps.apple.com/us/app/shein-fashion-shopping-online/id878577184"));
            add(new App(new ArrayList<String>(Arrays.asList("Finance","Utilities")),"283646709","283646712","PayPal, Inc.","https://is2-ssl.mzstatic.com/image/thumb/Purple124/v4/23/6a/db/236adbfb-bdce-ae7d-be6f-06f1b4390c77/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","PayPal: Mobile Cash","2019-02-03","https://apps.apple.com/us/app/paypal-mobile-cash/id283646709"));
            add(new App(new ArrayList<String>(Arrays.asList("Navigation","Food & Drink")),"585027354","281956209","Google LLC","https://is4-ssl.mzstatic.com/image/thumb/Purple124/v4/77/1c/aa/771caa1c-3e0f-6db9-efc0-4fb52158f101/logo_maps_ios_color-0-1x_U007emarketing-0-0-GLES2_U002c0-512MB-sRGB-0-0-0-85-220-0-0-0-6.png/200x200bb.png","Google Maps - Transit & Food","2012-12-13","https://apps.apple.com/us/app/google-maps-transit-food/id585027354"));
            add(new App(new ArrayList<String>(Arrays.asList("Social Networking","Utilities")),"310633997","310634000","WhatsApp Inc.","https://is2-ssl.mzstatic.com/image/thumb/Purple124/v4/67/2a/c1/672ac19f-b4c9-9f92-9dcc-6bd43d09c398/AppIcon-0-0-1x_U007emarketing-0-0-0-6-0-0-85-220.png/200x200bb.png","WhatsApp Messenger","2009-05-04","https://apps.apple.com/us/app/whatsapp-messenger/id310633997"));
            add(new App(new ArrayList<String>(Arrays.asList("Food & Drink","Lifestyle")),"719972451","719972454","DoorDash, Inc.","https://is2-ssl.mzstatic.com/image/thumb/Purple114/v4/59/eb/5c/59eb5c1b-2d77-55ca-c7a2-3a6e8186a310/AppIcon-0-0-1x_U007emarketing-0-0-0-4-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","DoorDash - Food Delivery","2013-10-10","https://apps.apple.com/us/app/doordash-food-delivery/id719972451"));
            add(new App(new ArrayList<String>(Arrays.asList("Music","Entertainment")),"324684580","324684583","Spotify Ltd.","https://is5-ssl.mzstatic.com/image/thumb/Purple114/v4/fe/9c/cd/fe9ccd64-03da-cf69-28be-99162a493272/AppIcon-0-0-1x_U007emarketing-0-0-0-6-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","Spotify: Music and Podcasts","2011-07-14","https://apps.apple.com/us/app/spotify-music-and-podcasts/id324684580"));
            add(new App(new ArrayList<String>(Arrays.asList("Finance","Utilities")),"351727428","351727431","Venmo","https://is5-ssl.mzstatic.com/image/thumb/Purple124/v4/fd/b1/e4/fdb1e4c7-62f4-d3df-9a26-aa3c67162e15/AppIcon-0-1x_U007emarketing-0-0-GLES2_U002c0-512MB-sRGB-0-0-0-85-220-0-0-0-7.png/200x200bb.png","Venmo","2010-04-03","https://apps.apple.com/us/app/venmo/id351727428"));
        }});

        put("Top Grossing Apps", new ArrayList<App>(){{
            add(new App(new ArrayList<String>(Arrays.asList("Games","Adventure","Entertainment","Action")),"431946152","431946155","Roblox Corporation","https://is2-ssl.mzstatic.com/image/thumb/Purple114/v4/99/6b/e0/996be0d9-ee80-b5c3-33f4-5c4591ca1ceb/AppIcon-0-1x_U007emarketing-0-0-85-220-7.png/200x200bb.png","Roblox","2011-05-26","https://apps.apple.com/us/app/roblox/id431946152"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Action","Entertainment","Strategy")),"529479190","488106216","Supercell","https://is1-ssl.mzstatic.com/image/thumb/Purple123/v4/c2/bf/c6/c2bfc64d-0300-4b9d-09a1-dfd663a2661c/AppIcon-0-0-1x_U007emarketing-0-0-0-6-0-85-220.png/200x200bb.png","Clash of Clans","2012-08-02","https://apps.apple.com/us/app/clash-of-clans/id529479190"));
            add(new App(new ArrayList<String>(Arrays.asList("Photo & Video","Entertainment")),"544007664","281956209","Google LLC","https://is2-ssl.mzstatic.com/image/thumb/Purple124/v4/d9/a5/26/d9a52639-12b4-5fd6-fdf1-584e6504cafa/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","YouTube: Watch, Listen, Stream","2012-09-11","https://apps.apple.com/us/app/youtube-watch-listen-stream/id544007664"));
            add(new App(new ArrayList<String>(Arrays.asList("Lifestyle","Social Networking")),"547702041","725634363","Tinder Inc.","https://is4-ssl.mzstatic.com/image/thumb/Purple124/v4/93/a6/ae/93a6aee8-b375-5db2-9783-8c7d38aacafe/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","Tinder","2012-08-03","https://apps.apple.com/us/app/tinder/id547702041"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Entertainment","Action","Adventure")),"1261357853","387428403","Epic Games","https://is5-ssl.mzstatic.com/image/thumb/Purple124/v4/43/73/f1/4373f169-801e-8790-39e4-8d56833371db/AppIcon-1x_U007emarketing-0-0-GLES2_U002c0-512MB-sRGB-0-0-0-85-220-0-0-0-6.png/200x200bb.png","Fortnite","2018-03-15","https://apps.apple.com/us/app/fortnite/id1261357853"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Role Playing","Entertainment","Action")),"1358222641","352305770","BANDAI NAMCO Entertainment Inc.","https://is2-ssl.mzstatic.com/image/thumb/Purple113/v4/a4/3d/d4/a43dd4e0-f34d-b6b3-f0cc-187842b9b448/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","DRAGON BALL LEGENDS","2018-05-31","https://apps.apple.com/us/app/dragon-ball-legends/id1358222641"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Entertainment","Puzzle","Casual")),"553834731","526656015","King","https://is3-ssl.mzstatic.com/image/thumb/Purple124/v4/91/07/4e/91074e3c-91be-f65d-c470-53fc88e085c8/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-85-220.png/200x200bb.png","Candy Crush Saga","2012-11-14","https://apps.apple.com/us/app/candy-crush-saga/id553834731"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Casual","Adventure")),"406889139","470556954","Moon Active","https://is5-ssl.mzstatic.com/image/thumb/Purple124/v4/0f/86/94/0f86948e-4c22-5e09-bb31-d4ab68d373c4/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-85-220.png/200x200bb.png","Coin Master","2010-12-11","https://apps.apple.com/us/app/coin-master/id406889139"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Strategy","Entertainment","Action")),"1053012308","488106216","Supercell","https://is3-ssl.mzstatic.com/image/thumb/Purple113/v4/f9/96/8b/f9968baa-8401-828a-6a97-f74dffeb5731/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-85-220.png/200x200bb.png","Clash Royale","2016-03-02","https://apps.apple.com/us/app/clash-royale/id1053012308"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Action","Strategy")),"1330123889","504515421","Tencent Mobile International Limited","https://is1-ssl.mzstatic.com/image/thumb/Purple123/v4/f5/20/c9/f520c95c-ebda-d2bc-7d79-c7e423a46c65/AppIcon-1x_U007emarketing-0-0-GLES2_U002c0-512MB-sRGB-0-0-0-85-220-0-0-0-8.png/200x200bb.png","PUBG MOBILE - 2nd Anniversary","2018-03-19","https://apps.apple.com/us/app/pubg-mobile-2nd-anniversary/id1330123889"));
            add(new App(new ArrayList<String>(Arrays.asList("Music")),"284035177","284035180","Pandora Media, Inc.","https://is2-ssl.mzstatic.com/image/thumb/Purple114/v4/4e/9c/b8/4e9cb833-0031-220c-9c11-2a5168692a80/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","Pandora: Music & Podcasts","2019-02-01","https://apps.apple.com/us/app/pandora-music-podcasts/id284035177"));
            add(new App(new ArrayList<String>(Arrays.asList("Entertainment")),"1446075923","284888248","Disney","https://is1-ssl.mzstatic.com/image/thumb/Purple114/v4/12/93/11/12931175-7272-c38b-4e09-4b973e936159/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","Disney+","2019-11-11","https://apps.apple.com/us/app/disney/id1446075923"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Entertainment","Puzzle","Simulation")),"1105855019","1162116447","Playrix","https://is5-ssl.mzstatic.com/image/thumb/Purple114/v4/0a/f7/52/0af75260-3565-9162-3d1a-4300e35d34ad/AppIcon-0-0-1x_U007emarketing-0-0-0-10-0-85-220.png/200x200bb.png","Gardenscapes","2016-08-25","https://apps.apple.com/us/app/gardenscapes/id1105855019"));
            add(new App(new ArrayList<String>(Arrays.asList("Lifestyle","Social Networking")),"930441707","1120675060","Bumble Holding Limited","https://is2-ssl.mzstatic.com/image/thumb/Purple124/v4/84/5b/a1/845ba113-7e9b-bbed-5432-556b835ea3dd/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","Bumble - Meet New People","2014-11-19","https://apps.apple.com/us/app/bumble-meet-new-people/id930441707"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Entertainment","Puzzle","Simulation")),"1195621598","1162116447","Playrix","https://is5-ssl.mzstatic.com/image/thumb/Purple123/v4/ab/88/31/ab883166-26a8-afec-9594-291f57b997d8/AppIcon-0-0-1x_U007emarketing-0-0-0-10-0-85-220.png/200x200bb.png","Homescapes","2017-09-19","https://apps.apple.com/us/app/homescapes/id1195621598"));
            add(new App(new ArrayList<String>(Arrays.asList("Entertainment","Lifestyle")),"363590051","363590054","Netflix, Inc.","https://is3-ssl.mzstatic.com/image/thumb/Purple124/v4/b5/1d/8c/b51d8c58-fa82-d985-ce62-eda702c33c36/AppIcon-0-0-1x_U007emarketing-0-0-0-10-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","Netflix","2010-04-01","https://apps.apple.com/us/app/netflix/id363590051"));
            add(new App(new ArrayList<String>(Arrays.asList("Entertainment","Lifestyle")),"376510438","376510441","Hulu, LLC","https://is3-ssl.mzstatic.com/image/thumb/Purple114/v4/14/3e/37/143e37c2-f4bb-b49c-b438-8805cf5b119d/HuluAppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","Hulu: Stream TV shows & movies","2010-06-29","https://apps.apple.com/us/app/hulu-stream-tv-shows-movies/id376510438"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Casual","Puzzle")),"1176027022","476160947","Peak Games","https://is1-ssl.mzstatic.com/image/thumb/Purple114/v4/5b/82/01/5b820112-10db-07cb-e5b1-8028791beda7/AppIcon-0-1x_U007emarketing-0-85-220-9.png/200x200bb.png","Toon Blast","2017-08-15","https://apps.apple.com/us/app/toon-blast/id1176027022"));
            add(new App(new ArrayList<String>(Arrays.asList("Photo & Video","Social Networking")),"460177396","358612219","Twitch Interactive, Inc.","https://is2-ssl.mzstatic.com/image/thumb/Purple113/v4/95/46/63/95466368-4da1-fe67-f577-fe5c20055bac/TwitchAppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","Twitch: Live Game Streaming","2011-10-26","https://apps.apple.com/us/app/twitch-live-game-streaming/id460177396"));
            add(new App(new ArrayList<String>(Arrays.asList("Social Networking","Entertainment")),"1077137248","940017134","BIGO TECHNOLOGY PTE. LTD.","https://is5-ssl.mzstatic.com/image/thumb/Purple124/v4/4a/0a/cb/4a0acb15-720d-deb7-657c-a038f404449c/AppIcon-0-0-1x_U007emarketing-0-0-0-10-0-0-85-220.png/200x200bb.png","BIGO LIVE - Live Stream","2016-03-12","https://apps.apple.com/us/app/bigo-live-live-stream/id1077137248"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Action","Role Playing","Entertainment")),"1292952049","1292952048","FoxNext Games, LLC","https://is2-ssl.mzstatic.com/image/thumb/Purple114/v4/10/c8/d1/10c8d16b-d8e8-caaa-6118-8f96185db087/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","MARVEL Strike Force: Squad RPG","2018-03-28","https://apps.apple.com/us/app/marvel-strike-force-squad-rpg/id1292952049"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Casino","Entertainment","Card")),"447553564","447553567","Playtika LTD","https://is4-ssl.mzstatic.com/image/thumb/Purple114/v4/eb/70/8f/eb708fdf-b78d-4e63-34b6-da78b29835e4/AppIcons-0-1x_U007emarketing-0-85-220-0-7.png/200x200bb.png","Slotomania™ Vegas Casino Slots","2011-11-07","https://apps.apple.com/us/app/slotomania-vegas-casino-slots/id447553564"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Puzzle","Entertainment","Simulation")),"664575829","1162116447","Playrix","https://is5-ssl.mzstatic.com/image/thumb/Purple114/v4/91/15/d9/9115d987-9038-82f6-6d32-dab30b1eeae1/AppIcon-0-0-1x_U007emarketing-0-0-0-6-0-85-220.png/200x200bb.png","Fishdom","2015-12-10","https://apps.apple.com/us/app/fishdom/id664575829"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Strategy","Role Playing","Health & Fitness")),"1094591345","1037205060","Niantic, Inc.","https://is4-ssl.mzstatic.com/image/thumb/Purple124/v4/f7/e7/78/f7e77835-b160-6f7a-dd37-113a7916887d/AppIcon-0-1x_U007emarketing-0-85-220-0-9.png/200x200bb.png","Pokémon GO","2016-07-07","https://apps.apple.com/us/app/pok%C3%A9mon-go/id1094591345"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Casual","Puzzle")),"850417475","526656015","King","https://is3-ssl.mzstatic.com/image/thumb/Purple114/v4/00/4c/b1/004cb103-755d-0470-50dc-a783b17b6d99/AppIcon-0-1x_U007emarketing-0-85-220-0-10.png/200x200bb.png","Candy Crush Soda Saga","2014-11-11","https://apps.apple.com/us/app/candy-crush-soda-saga/id850417475"));
        }});

        put("Top Paid Apps", new ArrayList<App>(){{
            add(new App(new ArrayList<String>(Arrays.asList("Games","Simulation","Adventure")),"479516143","479516146","Mojang","https://is2-ssl.mzstatic.com/image/thumb/Purple113/v4/56/00/ed/5600ed67-7cb0-d773-231c-9923d013eee5/AppIcon-0-1x_U007emarketing-0-85-220-9.png/200x200bb.png","Minecraft","2011-11-17","https://apps.apple.com/us/app/minecraft/id479516143"));
            add(new App(new ArrayList<String>(Arrays.asList("News","Utilities")),"341776037","323131781","Smartest Apps LLC","https://is4-ssl.mzstatic.com/image/thumb/Purple113/v4/c3/14/d3/c314d3e0-6661-9717-234b-48e54b344cec/AppIcon-1x_U007emarketing-0-4-85-220.png/200x200bb.png","5-0 Radio Pro Police Scanner","2009-12-04","https://apps.apple.com/us/app/5-0-radio-pro-police-scanner/id341776037"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Board","Family")),"1477966166","988365603","Marmalade Game Studio","https://is5-ssl.mzstatic.com/image/thumb/Purple124/v4/26/3d/f2/263df26f-a013-942d-dc2b-366c35be3900/AppIcon-0-1x_U007emarketing-0-0-GLES2_U002c0-512MB-sRGB-0-0-0-85-220-0-0-0-7.png/200x200bb.png","Monopoly","2019-12-04","https://apps.apple.com/us/app/monopoly/id1477966166"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Strategy","Simulation")),"525818839","525818842","Ndemic Creations","https://is5-ssl.mzstatic.com/image/thumb/Purple124/v4/ee/73/a0/ee73a0a1-891a-f57c-5672-0996e4358d6a/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","Plague Inc.","2012-05-26","https://apps.apple.com/us/app/plague-inc/id525818839"));
            add(new App(new ArrayList<String>(Arrays.asList("Entertainment","Productivity")),"916366645","363433636","Savage Interactive Pty Ltd","https://is3-ssl.mzstatic.com/image/thumb/Purple113/v4/5d/2a/b8/5d2ab8c6-722e-b68d-1d8e-fac1dbbb85e4/AppIcon-0-0-1x_U007emarketing-0-0-0-5-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","Procreate Pocket","2014-12-17","https://apps.apple.com/us/app/procreate-pocket/id916366645"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Strategy","Action","Entertainment")),"1118115766","386241773","Ninja Kiwi","https://is5-ssl.mzstatic.com/image/thumb/Purple114/v4/4e/53/89/4e5389b0-a8eb-7035-cd9c-a8774a3dbb9b/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","Bloons TD 6","2018-06-14","https://apps.apple.com/us/app/bloons-td-6/id1118115766"));
            add(new App(new ArrayList<String>(Arrays.asList("Business")),"294934058","294934061","HotSchedules","https://is2-ssl.mzstatic.com/image/thumb/Purple114/v4/5c/1d/7a/5c1d7af3-afe7-bb9a-f0bd-010ece8ef8a7/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","HotSchedules","2008-10-31","https://apps.apple.com/us/app/hotschedules/id294934058"));
            add(new App(new ArrayList<String>(Arrays.asList("Entertainment","Games")),"1422924517","1422924516","David Desrochers","https://is5-ssl.mzstatic.com/image/thumb/Purple123/v4/06/3e/8c/063e8ced-9f9e-d369-04e1-0e1478f6c172/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","Dokk OS","2018-08-13","https://apps.apple.com/us/app/dokk-os/id1422924517"));
            add(new App(new ArrayList<String>(Arrays.asList("Photo & Video","Lifestyle")),"606310581","606310584","Lightricks Ltd.","https://is5-ssl.mzstatic.com/image/thumb/Purple113/v4/4a/e4/ef/4ae4efa3-50b1-a4f5-5fa5-36cc08620770/AppIcon-0-0-1x_U007emarketing-0-0-0-3-0-85-220.png/200x200bb.png","Facetune","2013-03-07","https://apps.apple.com/us/app/facetune/id606310581"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Entertainment","Adventure","Action")),"763692274","330049731","Rockstar Games","https://is2-ssl.mzstatic.com/image/thumb/Purple123/v4/6d/92/8a/6d928aa4-847e-5692-8c07-72f772b271a7/AppIcon-2-0-1x_U007emarketing-0-85-220-10.png/200x200bb.png","Grand Theft Auto: San Andreas","2013-12-12","https://apps.apple.com/us/app/grand-theft-auto-san-andreas/id763692274"));
            add(new App(new ArrayList<String>(Arrays.asList("Photo & Video","Utilities")),"373311252","598565208","ADVA Soft GmbH","https://is1-ssl.mzstatic.com/image/thumb/Purple123/v4/a3/ff/ea/a3ffea40-6941-2b20-2d8c-9359c430c7c3/AppIcon-0-0-1x_U007emarketing-0-0-0-10-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","TouchRetouch","2010-06-08","https://apps.apple.com/us/app/touchretouch/id373311252"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Entertainment","Casual","Music")),"625334537","414027834","RobTop Games AB","https://is2-ssl.mzstatic.com/image/thumb/Purple118/v4/b6/5d/7b/b65d7be5-e14a-433f-bb53-8cc2407e6199/AppIcon-1x_U007emarketing-85-220-9.png/200x200bb.png","Geometry Dash","2013-08-13","https://apps.apple.com/us/app/geometry-dash/id625334537"));
            add(new App(new ArrayList<String>(Arrays.asList("Productivity","Utilities")),"1359485719","1275307195","Kpaw, LLC","https://is2-ssl.mzstatic.com/image/thumb/Purple113/v4/3a/a1/59/3aa159b8-6a98-9322-0ce1-2b0ec0cd5752/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","FlickType Keyboard","2018-04-26","https://apps.apple.com/us/app/flicktype-keyboard/id1359485719"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Adventure","Entertainment","Simulation")),"640364616","392990484","505 Games (US), Inc.","https://is3-ssl.mzstatic.com/image/thumb/Purple113/v4/ad/53/08/ad53086b-7ebc-4dd6-e889-1d39a27e2d23/AppIcon-0-1x_U007emarketing-0-0-GLES2_U002c0-512MB-sRGB-0-0-0-85-220-0-0-0-7.png/200x200bb.png","Terraria","2013-08-29","https://apps.apple.com/us/app/terraria/id640364616"));
            add(new App(new ArrayList<String>(Arrays.asList("Health & Fitness","Medical")),"1164801111","861650887","Tantsissa","https://is1-ssl.mzstatic.com/image/thumb/Purple123/v4/27/99/d8/2799d848-c85c-22aa-c4e5-d15b6bdde313/AppIcon-0-0-1x_U007emarketing-0-0-0-2-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","AutoSleep Track Sleep on Watch","2016-12-20","https://apps.apple.com/us/app/autosleep-track-sleep-on-watch/id1164801111"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Action","Sports","Sports")),"1471692155","324563547","2K","https://is3-ssl.mzstatic.com/image/thumb/Purple113/v4/e5/ac/dc/e5acdcc4-31bb-55a3-c870-2b4aa61813e7/AppIcon-0-1x_U007emarketing-0-85-220-0-7.png/200x200bb.png","NBA 2K20","2019-09-04","https://apps.apple.com/us/app/nba-2k20/id1471692155"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Board","Family")),"1117405948","988365603","Marmalade Game Studio","https://is4-ssl.mzstatic.com/image/thumb/Purple123/v4/a9/26/77/a9267700-c72f-df17-27f0-96987956068d/AppIcon-1x_U007emarketing-85-220-6.png/200x200bb.png","The Game of Life","2016-07-14","https://apps.apple.com/us/app/the-game-of-life/id1117405948"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Entertainment","Sports","Action")),"549105915","337866373","True Axis","https://is1-ssl.mzstatic.com/image/thumb/Purple123/v4/c3/d9/bd/c3d9bd8d-2118-7463-bd6c-e319ad7f8036/AppIcon-0-0-1x_U007emarketing-0-0-0-4-85-220.png/200x200bb.png","True Skate","2012-10-18","https://apps.apple.com/us/app/true-skate/id549105915"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Strategy","Action")),"912536422","1438432084","Clickteam, LLC","https://is1-ssl.mzstatic.com/image/thumb/Purple113/v4/58/6a/8d/586a8d6e-5db2-f2d2-43f9-b830c5697728/AppIcon-0-1x_U007emarketing-0-85-220-10.png/200x200bb.png","Five Nights at Freddy's","2014-09-11","https://apps.apple.com/us/app/five-nights-at-freddys/id912536422"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Strategy","Simulation")),"824305459","514634238","Flipline Studios","https://is2-ssl.mzstatic.com/image/thumb/Purple124/v4/44/d1/bb/44d1bb03-8871-ff83-c212-5c55b0f335a6/AppIcon-1x_U007emarketing-0-0-GLES2_U002c0-512MB-sRGB-0-0-0-85-220-0-0-0-6.png/200x200bb.png","Papa's Freezeria To Go!","2014-02-26","https://apps.apple.com/us/app/papas-freezeria-to-go/id824305459"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Strategy","Action")),"1499849161","1438432084","Clickteam, LLC","https://is3-ssl.mzstatic.com/image/thumb/Purple123/v4/a6/7b/5a/a67b5a78-6e9e-b829-372a-f935c3f22f7c/AppIcon-0-0-1x_U007emarketing-0-0-0-10-85-220.png/200x200bb.png","Ultimate Custom Night","2020-04-28","https://apps.apple.com/us/app/ultimate-custom-night/id1499849161"));
            add(new App(new ArrayList<String>(Arrays.asList("Education","Entertainment")),"404990064","378238417","Terminal Eleven LLC","https://is1-ssl.mzstatic.com/image/thumb/Purple113/v4/7f/1a/84/7f1a84ee-7452-7fbe-57ad-5539b95aea07/AppIcon-0-0-1x_U007emarketing-0-0-0-4-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","SkyView®","2010-12-10","https://apps.apple.com/us/app/skyview/id404990064"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Board","Strategy")),"1150534552","988365603","Marmalade Game Studio","https://is1-ssl.mzstatic.com/image/thumb/Purple124/v4/ba/14/bf/ba14bf1d-962d-35df-f8d5-84af4432e24d/AppIcon-0-1x_U007emarketing-0-85-220-7.png/200x200bb.png","Clue: The Classic Mystery Game","2017-01-09","https://apps.apple.com/us/app/clue-the-classic-mystery-game/id1150534552"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Action","Entertainment","Strategy")),"563718995","386241773","Ninja Kiwi","https://is4-ssl.mzstatic.com/image/thumb/Purple123/v4/47/54/7f/47547fdc-3d12-fa42-5074-63932d0880ba/AppIcon-0-1x_U007emarketing-0-85-220-0-3.png/200x200bb.png","Bloons TD 5","2012-11-15","https://apps.apple.com/us/app/bloons-td-5/id563718995"));
            add(new App(new ArrayList<String>(Arrays.asList("Reference","Education")),"576588894","451087546","Fifth Star Labs LLC","https://is4-ssl.mzstatic.com/image/thumb/Purple113/v4/cf/f9/9f/cff99f70-c242-f03e-daf5-12172d9167ae/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","Sky Guide","2013-05-06","https://apps.apple.com/us/app/sky-guide/id576588894"));

        }});

        put("New Apps We Love", new ArrayList<App>(){{
            add(new App(new ArrayList<String>(Arrays.asList("Entertainment","Lifestyle")),"971265422","300988148","HBO","https://is4-ssl.mzstatic.com/image/thumb/Purple123/v4/39/29/8a/39298ab6-22b6-97c3-c994-997e518d2c48/AppIconNOW-0-0-1x_U007emarketing-0-0-0-7-85-220.png/200x200bb.png","HBO NOW: Stream TV & Movies","2015-04-07","https://apps.apple.com/us/app/hbo-now-stream-tv-movies/id971265422"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Strategy","Role Playing","Health & Fitness")),"1094591345","1037205060","Niantic, Inc.","https://is4-ssl.mzstatic.com/image/thumb/Purple124/v4/f7/e7/78/f7e77835-b160-6f7a-dd37-113a7916887d/AppIcon-0-1x_U007emarketing-0-85-220-0-9.png/200x200bb.png","Pokémon GO","2016-07-07","https://apps.apple.com/us/app/pok%C3%A9mon-go/id1094591345"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Casual","Entertainment","Action")),"1229016807","488106216","Supercell","https://is3-ssl.mzstatic.com/image/thumb/Purple123/v4/4a/3d/86/4a3d86a4-23c7-23f3-fe23-5539d8f11531/AppIcon-0-1x_U007emarketing-0-85-220-0-6.png/200x200bb.png","Brawl Stars","2018-12-13","https://apps.apple.com/us/app/brawl-stars/id1229016807"));
            add(new App(new ArrayList<String>(Arrays.asList("Lifestyle","Social Networking")),"547702041","725634363","Tinder Inc.","https://is4-ssl.mzstatic.com/image/thumb/Purple124/v4/93/a6/ae/93a6aee8-b375-5db2-9783-8c7d38aacafe/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","Tinder","2012-08-03","https://apps.apple.com/us/app/tinder/id547702041"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Simulation","Adventure")),"479516143","479516146","Mojang","https://is2-ssl.mzstatic.com/image/thumb/Purple113/v4/56/00/ed/5600ed67-7cb0-d773-231c-9923d013eee5/AppIcon-0-1x_U007emarketing-0-85-220-9.png/200x200bb.png","Minecraft","2011-11-17","https://apps.apple.com/us/app/minecraft/id479516143"));
            add(new App(new ArrayList<String>(Arrays.asList("Health & Fitness","Lifestyle")),"571800810","571800813","Calm.com","https://is5-ssl.mzstatic.com/image/thumb/Purple114/v4/ee/7a/78/ee7a7836-55a1-eff0-7188-355af0a9a5e9/AppIcon-0-0-1x_U007emarketing-0-0-0-10-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","Calm","2013-02-22","https://apps.apple.com/us/app/calm/id571800810"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Entertainment","Word","Card")),"623592465","298372283","Warner Bros.","https://is1-ssl.mzstatic.com/image/thumb/Purple114/v4/ae/cf/c0/aecfc0ff-acdc-2c3c-ba12-104e1b8f9a67/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","Heads Up!","2013-05-02","https://apps.apple.com/us/app/heads-up/id623592465"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Role Playing","Simulation","Entertainment")),"656971078","761807761","Episode Interactive","https://is1-ssl.mzstatic.com/image/thumb/Purple123/v4/2a/4c/f0/2a4cf0b8-176b-0ee9-84ad-6c4301b94ec9/AppIcon-0-0-1x_U007emarketing-0-0-0-7-85-220.png/200x200bb.png","Episode - Choose Your Story","2013-12-18","https://apps.apple.com/us/app/episode-choose-your-story/id656971078"));
            add(new App(new ArrayList<String>(Arrays.asList("Sports","Entertainment")),"317469184","317469187","ESPN","https://is5-ssl.mzstatic.com/image/thumb/Purple124/v4/9a/72/e0/9a72e0cf-88e8-124d-5d2e-3c41e176a0fd/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","ESPN: Live Sports & Scores","2009-06-02","https://apps.apple.com/us/app/espn-live-sports-scores/id317469184"));
            add(new App(new ArrayList<String>(Arrays.asList("Utilities")),"1022831885","326264295","TelTech Systems","https://is4-ssl.mzstatic.com/image/thumb/Purple114/v4/dd/07/51/dd0751b6-ed25-1169-ddb7-3916b8fba097/BlueAppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","RoboKiller: Block Spam Calls","2015-09-08","https://apps.apple.com/us/app/robokiller-block-spam-calls/id1022831885"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Action","Entertainment","Strategy")),"529479190","488106216","Supercell","https://is1-ssl.mzstatic.com/image/thumb/Purple123/v4/c2/bf/c6/c2bfc64d-0300-4b9d-09a1-dfd663a2661c/AppIcon-0-0-1x_U007emarketing-0-0-0-6-0-85-220.png/200x200bb.png","Clash of Clans","2012-08-02","https://apps.apple.com/us/app/clash-of-clans/id529479190"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Role Playing","Entertainment","Simulation")),"1071310449","575608309","Pixelberry Studios","https://is2-ssl.mzstatic.com/image/thumb/Purple114/v4/31/66/f2/3166f224-ee12-5218-8d59-0a699deaadc7/AppIcon-0-1x_U007emarketing-0-85-220-0-7.png/200x200bb.png","Choices: Stories You Play","2016-08-20","https://apps.apple.com/us/app/choices-stories-you-play/id1071310449"));
            add(new App(new ArrayList<String>(Arrays.asList("Music","Entertainment")),"509993510","290596339","Smule","https://is5-ssl.mzstatic.com/image/thumb/Purple114/v4/10/05/42/10054242-30f6-62e8-9440-d9b0d1c93eef/AppIcon-CCCP-0-1x_U007emarketing-0-0-85-220-0-7.png/200x200bb.png","Smule - The Social Singing App","2012-08-08","https://apps.apple.com/us/app/smule-the-social-singing-app/id509993510"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Board","Family")),"1117405948","988365603","Marmalade Game Studio","https://is4-ssl.mzstatic.com/image/thumb/Purple123/v4/a9/26/77/a9267700-c72f-df17-27f0-96987956068d/AppIcon-1x_U007emarketing-85-220-6.png/200x200bb.png","The Game of Life","2016-07-14","https://apps.apple.com/us/app/the-game-of-life/id1117405948"));
            add(new App(new ArrayList<String>(Arrays.asList("Entertainment","Utilities")),"530168168","295669712","CBS Interactive","https://is2-ssl.mzstatic.com/image/thumb/Purple114/v4/fa/c5/ec/fac5ec67-6b29-f828-a590-89c53f037440/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","CBS - Full Episodes & Live TV","2013-03-14","https://apps.apple.com/us/app/cbs-full-episodes-live-tv/id530168168"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Entertainment","Sports","Simulation")),"543186831","337457683","Miniclip.com","https://is1-ssl.mzstatic.com/image/thumb/Purple114/v4/98/09/cf/9809cfaa-cc21-9e06-0585-bb327be887b2/AppIcon-0-1x_U007emarketing-0-0-85-220-0-7.png/200x200bb.png","8 Ball Pool™","2013-02-27","https://apps.apple.com/us/app/8-ball-pool/id543186831"));
            add(new App(new ArrayList<String>(Arrays.asList("Entertainment")),"996246479","315708143","Showtime Networks Inc.","https://is4-ssl.mzstatic.com/image/thumb/Purple114/v4/5f/77/48/5f77482f-5535-ddad-abc5-f1a16e735c2c/OTT-AppIcon-0-0-1x_U007emarketing-0-0-0-6-0-0-85-220.png/200x200bb.png","SHOWTIME: TV, Movies and More","2015-07-07","https://apps.apple.com/us/app/showtime-tv-movies-and-more/id996246479"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Action","Entertainment","Strategy")),"563718995","386241773","Ninja Kiwi","https://is4-ssl.mzstatic.com/image/thumb/Purple123/v4/47/54/7f/47547fdc-3d12-fa42-5074-63932d0880ba/AppIcon-0-1x_U007emarketing-0-85-220-0-3.png/200x200bb.png","Bloons TD 5","2012-11-15","https://apps.apple.com/us/app/bloons-td-5/id563718995"));
            add(new App(new ArrayList<String>(Arrays.asList("Entertainment","Lifestyle")),"545519333","297606954","AMZN Mobile LLC","https://is5-ssl.mzstatic.com/image/thumb/Purple124/v4/56/fc/9e/56fc9ed7-3372-d695-72a1-5479d27ddd0c/AppIcon-0-1x_U007emarketing-0-0-GLES2_U002c0-512MB-sRGB-0-0-0-85-220-0-0-0-7.png/200x200bb.png","Amazon Prime Video","2012-07-31","https://apps.apple.com/us/app/amazon-prime-video/id545519333"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Entertainment","Racing","Casual")),"887947640","330281898","NaturalMotion","https://is3-ssl.mzstatic.com/image/thumb/Purple114/v4/20/15/77/2015770a-632c-1a91-b03f-0a3536efb89e/AppIcon-0-1x_U007emarketing-0-0-GLES2_U002c0-512MB-sRGB-0-0-0-85-220-0-0-0-10.png/200x200bb.png","CSR Racing 2 - #1 Racing Games","2016-06-29","https://apps.apple.com/us/app/csr-racing-2-1-racing-games/id887947640"));
            add(new App(new ArrayList<String>(Arrays.asList("Photo & Video","Utilities")),"1381206010","606310584","Lightricks Ltd.","https://is5-ssl.mzstatic.com/image/thumb/Purple114/v4/4f/0b/19/4f0b1904-ad04-4baf-9396-fcb9be44b03c/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","Enlight Pixaloop - Move Photos","2018-09-09","https://apps.apple.com/us/app/enlight-pixaloop-move-photos/id1381206010"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Strategy","Entertainment","Action")),"1053012308","488106216","Supercell","https://is3-ssl.mzstatic.com/image/thumb/Purple113/v4/f9/96/8b/f9968baa-8401-828a-6a97-f74dffeb5731/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-85-220.png/200x200bb.png","Clash Royale","2016-03-02","https://apps.apple.com/us/app/clash-royale/id1053012308"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Entertainment","Role Playing","Simulation")),"1406710800","1163786770","Chucklefish Limited","https://is5-ssl.mzstatic.com/image/thumb/Purple114/v4/2d/19/2e/2d192ee2-8980-563e-7ad2-d1699f6c46d3/AppIcons-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","Stardew Valley","2018-10-24","https://apps.apple.com/us/app/stardew-valley/id1406710800"));
            add(new App(new ArrayList<String>(Arrays.asList("Music","Entertainment")),"418987775","319295335","TuneIn","https://is4-ssl.mzstatic.com/image/thumb/Purple114/v4/ba/31/ff/ba31ff75-9fc2-1f32-8122-6730ad802b51/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","TuneIn - NBA Radio & Live News","2011-04-19","https://apps.apple.com/us/app/tunein-nba-radio-live-news/id418987775"));
            add(new App(new ArrayList<String>(Arrays.asList("Productivity","Reference")),"288113403","288113406","iTranslate","https://is5-ssl.mzstatic.com/image/thumb/Purple114/v4/16/d2/42/16d24249-1e39-44b1-ddba-f897c523aac1/AppIcon-0-0-1x_U007emarketing-0-0-0-6-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","iTranslate Translator","2019-02-11","https://apps.apple.com/us/app/itranslate-translator/id288113403"));

        }});

        put("New Games We Love", new ArrayList<App>(){{
            add(new App(new ArrayList<String>(Arrays.asList("Games","Action","Role Playing")),"1152350815","300186801","SQUARE ENIX","https://is5-ssl.mzstatic.com/image/thumb/Purple124/v4/f8/b5/fe/f8b5fead-500d-59ed-25e0-dca91d6aba1c/AppIcon-0-1x_U007emarketing-0-0-GLES2_U002c0-512MB-sRGB-0-0-0-85-220-0-0-0-6.png/200x200bb.png","FINALFANTASY XV POCKET EDITION","2018-02-08","https://apps.apple.com/us/app/finalfantasy-xv-pocket-edition/id1152350815"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Music","Action")),"1287138671","1275826615","Drool LLC","https://is5-ssl.mzstatic.com/image/thumb/Purple113/v4/7b/b0/2e/7bb02eeb-74c7-e6c1-994a-ed9929d74469/AppIcon-0-0-1x_U007emarketing-0-0-0-5-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","Thumper: Pocket Edition","2018-01-24","https://apps.apple.com/us/app/thumper-pocket-edition/id1287138671"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Adventure","Puzzle")),"1201642309","481629893","Playdead","https://is5-ssl.mzstatic.com/image/thumb/Purple118/v4/ee/2f/83/ee2f83d4-053e-512a-9d2e-dd85d7250cec/AppIcon-0-1x_U007emarketing-0-0-GLES2_U002c0-512MB-sRGB-0-0-0-85-220-0-0-0-9.png/200x200bb.png","Playdead's INSIDE","2017-12-14","https://apps.apple.com/us/app/playdeads-inside/id1201642309"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Adventure","Puzzle")),"1209489068","1209489067","Polytron Inc.","https://is2-ssl.mzstatic.com/image/thumb/Purple123/v4/48/36/14/4836147f-2d11-33f7-7be4-9f4db7e709cb/AppIcon-0-1x_U007emarketing-0-85-220-7.png/200x200bb.png","FEZ Pocket Edition","2017-12-13","https://apps.apple.com/us/app/fez-pocket-edition/id1209489068"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Puzzle","Family")),"1269225754","1242610251","Annapurna Interactive","https://is1-ssl.mzstatic.com/image/thumb/Purple128/v4/b4/01/d7/b401d7d4-7fd1-5494-c1f5-5e42bb8da080/AppIcon-0-1x_U007emarketing-0-85-220-0-7.png/200x200bb.png","Gorogoa","2017-12-14","https://apps.apple.com/us/app/gorogoa/id1269225754"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Role Playing","Adventure")),"1180101534","300186801","SQUARE ENIX","https://is1-ssl.mzstatic.com/image/thumb/Purple123/v4/bb/b0/f2/bbb0f231-b7d3-530f-566b-d395371954c3/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-85-220.png/200x200bb.png","Life Is Strange","2017-12-14","https://apps.apple.com/us/app/life-is-strange/id1180101534"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Adventure","Puzzle","Entertainment")),"1234617736","712167048","kunabi brother GmbH","https://is1-ssl.mzstatic.com/image/thumb/Purple128/v4/76/e2/03/76e2038f-1459-0678-73e9-2f2ac0e2eed0/AppIcon-0-1x_U007emarketing-0-85-220-0-9.png/200x200bb.png","FROST","2017-10-25","https://apps.apple.com/us/app/frost/id1234617736"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Adventure","Puzzle")),"1033471974","853087985","FIFTYTWO","https://is4-ssl.mzstatic.com/image/thumb/Purple123/v4/50/d0/85/50d085ab-3230-4b40-0474-21bcb6a9325a/AppIcon-0-1x_U007emarketing-0-85-220-0-7.png/200x200bb.png","Kenshō","2017-09-17","https://apps.apple.com/us/app/kensh%C5%8D/id1033471974"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Family","Adventure")),"1279174518","1242610251","Annapurna Interactive","https://is5-ssl.mzstatic.com/image/thumb/Purple123/v4/22/c9/fd/22c9fd6b-36c6-5efd-09e0-a059f9c9e929/AppIcon-0-0-1x_U007emarketing-0-0-0-4-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png","Flower","2017-09-28","https://apps.apple.com/us/app/flower/id1279174518"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Adventure","Puzzle")),"1230231705","1167726848","Thekla, inc.","https://is3-ssl.mzstatic.com/image/thumb/Purple123/v4/a4/d0/1e/a4d01e77-0e97-04f7-67ca-a9f7ed7555a6/AppIcon-0-1x_U007emarketing-0-0-GLES2_U002c0-512MB-sRGB-0-0-0-85-220-0-0-0-7.png/200x200bb.png","The Witness","2017-09-21","https://apps.apple.com/us/app/the-witness/id1230231705"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Card","Strategy")),"1084019358","547109759","Bethesda","https://is3-ssl.mzstatic.com/image/thumb/Purple113/v4/66/d4/5b/66d45b9f-2cbc-aee3-8258-e5c5c3617946/AppIcon-0-1x_U007emarketing-0-85-220-9.png/200x200bb.png","The Elder Scrolls: Legends CCG","2017-03-22","https://apps.apple.com/us/app/the-elder-scrolls-legends-ccg/id1084019358"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Adventure","Puzzle","Entertainment")),"1187265767","297468910","ustwo games","https://is5-ssl.mzstatic.com/image/thumb/Purple113/v4/cb/b4/68/cbb4680d-a8ac-6b64-3309-f18f77b5f6cc/AppIcon-0-1x_U007emarketing-0-85-220-0-7.png/200x200bb.png","Monument Valley 2","2017-05-30","https://apps.apple.com/us/app/monument-valley-2/id1187265767"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Puzzle","Adventure")),"1204902987","394127428","Broken Rules","https://is3-ssl.mzstatic.com/image/thumb/Purple123/v4/3f/89/66/3f896654-db09-686d-e39a-bb286a8df406/AppIcon-0-1x_U007emarketing-0-0-GLES2_U002c0-512MB-sRGB-0-0-0-85-220-0-0-0-9.png/200x200bb.png","Old Man's Journey","2017-05-18","https://apps.apple.com/us/app/old-mans-journey/id1204902987"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Action","Entertainment","Role Playing")),"1109008423","298372283","Warner Bros.","https://is2-ssl.mzstatic.com/image/thumb/Purple114/v4/91/ec/b7/91ecb7ea-41f5-9420-a9c3-25830c984a4f/AppIcon-0-1x_U007emarketing-0-85-220-0-7.png/200x200bb.png","Injustice 2","2017-05-09","https://apps.apple.com/us/app/injustice-2/id1109008423"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Action")),"1046450453","298910979","Rovio Entertainment Oyj","https://is4-ssl.mzstatic.com/image/thumb/Purple123/v4/57/17/73/571773f2-ff24-50fa-9d72-32e0fc312d0f/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-85-220.png/200x200bb.png","Battle Bay","2017-05-03","https://apps.apple.com/us/app/battle-bay/id1046450453"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Action","Strategy","Entertainment")),"1184057550","1019335866","GungHo Online Entertainment America, Inc.","https://is1-ssl.mzstatic.com/image/thumb/Purple118/v4/d7/9d/6d/d79d6d58-f2ca-93b3-3399-0cb23448d21a/AppIcon-1x_U007emarketing-85-220-0-8.png/200x200bb.png","Super Senso","2017-04-25","https://apps.apple.com/us/app/super-senso/id1184057550"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Role Playing","Action","Entertainment")),"1002635492","1453908357","Kabam Games, Inc.","https://is2-ssl.mzstatic.com/image/thumb/Purple124/v4/f5/c0/95/f5c095a6-379e-ed4c-d794-ab5b7cda7009/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-85-220.png/200x200bb.png","TRANSFORMERS: Forged to Fight","2017-04-05","https://apps.apple.com/us/app/transformers-forged-to-fight/id1002635492"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Adventure","Role Playing")),"1179177872","1179177871","Night School Studio","https://is3-ssl.mzstatic.com/image/thumb/Purple128/v4/f1/5f/86/f15f8697-9f30-2e23-8d0c-b1cc1c966d6b/AppIcon-1x_U007emarketing-85-220-5.png/200x200bb.png","OXENFREE","2017-03-16","https://apps.apple.com/us/app/oxenfree/id1179177872"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Puzzle","Action")),"1193911528","1193911527","Untame","https://is1-ssl.mzstatic.com/image/thumb/Purple62/v4/b2/79/4b/b2794b75-7379-c530-99c8-b01262a735e3/AppIcon-1x_U007emarketing-85-220-4.png/200x200bb.png","Mushroom 11","2017-03-09","https://apps.apple.com/us/app/mushroom-11/id1193911528"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Entertainment","Puzzle","Adventure")),"1181212221","712167048","kunabi brother GmbH","https://is4-ssl.mzstatic.com/image/thumb/Purple113/v4/e0/a5/80/e0a58051-13c5-297e-2b7f-feb671f84485/AppIcon-0-1x_U007emarketing-0-85-220-9.png/200x200bb.png","Euclidean Lands","2017-03-12","https://apps.apple.com/us/app/euclidean-lands/id1181212221"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Puzzle","Adventure")),"928945016","928945015","Loju LTD","https://is3-ssl.mzstatic.com/image/thumb/Purple123/v4/1d/8d/1c/1d8d1c16-7010-09f1-dcd7-d99516053395/AppIcon-0-1x_U007emarketing-0-85-220-0-7.png/200x200bb.png","Causality","2017-02-13","https://apps.apple.com/us/app/causality/id928945016"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Puzzle","Adventure")),"1107320261","371411654","RAC7 Games","https://is4-ssl.mzstatic.com/image/thumb/Purple128/v4/e7/cb/cc/e7cbcc9c-1bd2-985c-b640-9d5155b46092/mzl.ryvdpmwe.png/200x200bb.png","Splitter Critters","2017-01-26","https://apps.apple.com/us/app/splitter-critters/id1107320261"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Adventure")),"1147297267","534603952","Klei","https://is3-ssl.mzstatic.com/image/thumb/Purple113/v4/a9/7a/5a/a97a5af8-9251-733f-eafb-c49ae0b5631d/AppIcon-0-1x_U007emarketing-0-85-220-10.png/200x200bb.png","Don't Starve: Shipwrecked","2016-12-26","https://apps.apple.com/us/app/dont-starve-shipwrecked/id1147297267"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Action","Casual")),"1145275343","1062496488","Nintendo Co., Ltd.","https://is1-ssl.mzstatic.com/image/thumb/Purple113/v4/1e/f5/a1/1ef5a1a1-5676-aee5-d2cc-cc113c68e43c/AppIcon-0-1x_U007emarketing-0-85-220-7.png/200x200bb.png","Super Mario Run","2016-09-07","https://apps.apple.com/us/app/super-mario-run/id1145275343"));
            add(new App(new ArrayList<String>(Arrays.asList("Games","Entertainment","Action","Strategy")),"911800950","330281898","NaturalMotion","https://is4-ssl.mzstatic.com/image/thumb/Purple124/v4/f9/54/da/f954da9c-9ef0-a4b3-e849-3fa4f2edd80e/AppIcon-0-0-1x_U007emarketing-0-0-0-7-85-220.png/200x200bb.png","Dawn of Titans: Strategy Game","2016-12-07","https://apps.apple.com/us/app/dawn-of-titans-strategy-game/id911800950"));
        }});
    }};

    public static void getAppCategories(String token, DataResponse<String> callback){
        if(token == null){
            callback.onFailure(new RequestException("Token is required!"));
        } else {
            Account account = authTokenAccountsMap.get(token);
            if(account == null){
                callback.onFailure(new RequestException("Invalid token account not found!"));
            } else {
                ArrayList<String> categories = new ArrayList<String>(apps.keySet());
                Collections.sort(categories);
                callback.onSuccess(categories);
            }
        }
    }

    public static void getAppsByCategory(String token, String category, DataResponse<App> callback){
        if(token == null){
            callback.onFailure(new RequestException("Token is required!"));
        } else {
            Account account = authTokenAccountsMap.get(token);
            if(account == null){
                callback.onFailure(new RequestException("Invalid token account not found!"));
            } else if(category == null) {
                callback.onFailure(new RequestException("Category is required!"));
            } else if(!apps.containsKey(category)) {
                callback.onFailure(new RequestException("Category not found!"));
            } else {
                callback.onSuccess(apps.get(category));
            }
        }
    }

    public static void login(String email, String password, AuthResponse callback){
        if(email == null || email.isEmpty() ){
            callback.onFailure(new RequestException("Email cannot be empty!"));
        } else {
            Account account = null;
            String token = null;
            for (Map.Entry<String, Account> entry : authTokenAccountsMap.entrySet()) {
                if(entry.getValue().email.equals(email.trim().toLowerCase())){
                    account = entry.getValue();
                    token = entry.getKey();
                    break;
                }
            }

            if(account == null){
                callback.onFailure(new RequestException("Email/Account not found!"));
            } else if(!account.getPassword().equals(password)){
                callback.onFailure(new RequestException("Email or Password do not match!"));
            } else {
                callback.onSuccess(token);
            }
        }
    }

    public static void register(String name, String email, String password, AuthResponse callback){
        if(name == null || name.isEmpty()){
            callback.onFailure(new RequestException("Name cannot be empty!"));
        } else if(email == null || email.isEmpty()){
            callback.onFailure(new RequestException("Email cannot be empty!"));
        } else if(password == null || password.isEmpty() ){
            callback.onFailure(new RequestException("Password cannot be empty!"));
        } else {
            Account account = null;
            String token = null;
            for (Map.Entry<String, Account> entry : authTokenAccountsMap.entrySet()) {
                if(entry.getValue().email.equals(email.trim().toLowerCase())){
                    account = entry.getValue();
                    token = entry.getKey();
                    break;
                }
            }
            if(account != null){
                callback.onFailure(new RequestException("Email already used please use another email!"));
            } else {
                account = new Account(name, email.trim().toLowerCase(), password);
                token = UUID.randomUUID().toString();
                authTokenAccountsMap.put(token, account);
                callback.onSuccess(token);
            }
        }
    }

    public static void getAccount(String token, AccountResponse callback){
        if(token == null){
            callback.onFailure(new RequestException("Token is required!"));
        } else {
            Account account = authTokenAccountsMap.get(token);
            if(account == null){
                callback.onFailure(new RequestException("Invalid token account not found!"));
            } else {
                callback.onSuccess(account);
            }
        }
    }

    public static void update(String token, Account oldAccount, String name, String password, AccountResponse callback){
        if(token == null){
            callback.onFailure(new RequestException("Token is required!"));
        } else {
            Account account = authTokenAccountsMap.get(token);
            if(account == null){
                callback.onFailure(new RequestException("Invalid token account not found!"));
            } else {
                if(name == null || name.isEmpty()){
                    callback.onFailure(new RequestException("Name cannot be empty!"));
                } else if(password == null || password.isEmpty() ){
                    callback.onFailure(new RequestException("Password cannot be empty!"));
                } else{
                    Account newAccount = new Account(name, account.getEmail(), password);
                    authTokenAccountsMap.put(token, newAccount);
                    callback.onSuccess(newAccount);
                }
            }
        }
    }

    public static class Account implements Serializable {
        private String name, email, password;
        public Account(String name, String email, String password) {
            this.name = name;
            this.email = email;
            this.password = password;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public String getPassword() {
            return password;
        }

        @Override
        public String toString() {
            return "Account{" +
                    "name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }

    public static class App  implements Serializable {
        ArrayList<String> genres;
        String id, artistId, artistName, artworkUrl100, name, releaseDate, url;

        public App(ArrayList<String> genres, String id, String artistId, String artistName, String artworkUrl100, String name, String releaseDate, String url) {
            this.genres = genres;
            this.id = id;
            this.artistId = artistId;
            this.artistName = artistName;
            this.artworkUrl100 = artworkUrl100;
            this.name = name;
            this.releaseDate = releaseDate;
            this.url = url;
        }

        @Override
        public String toString() {
            return "App{" +
                    "genres=" + genres +
                    ", id='" + id + '\'' +
                    ", artistId='" + artistId + '\'' +
                    ", artistName='" + artistName + '\'' +
                    ", artworkUrl100='" + artworkUrl100 + '\'' +
                    ", name='" + name + '\'' +
                    ", releaseDate='" + releaseDate + '\'' +
                    ", url='" + url + '\'' +
                    '}';
        }
    }

    public static class RequestException extends Exception {
        public RequestException(String errorMessage) {
            super(errorMessage);
        }
    }

    interface AuthResponse {
        void onSuccess(String token);
        void onFailure(RequestException exception);
    }

    interface AccountResponse {
        void onSuccess(Account account);
        void onFailure(RequestException exception);
    }

    interface DataResponse<T>{
        void onSuccess(ArrayList<T> data);
        void onFailure(RequestException exception);
    }
}
