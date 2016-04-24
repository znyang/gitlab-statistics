package com.zen.android.gitlab.sdk.protocol;

import retrofit.http.GET;
import retrofit.http.Path;

/**
 * @author zen
 * @version 2016/4/24
 */
public interface GitlabApi {

    /**
     * <pre>
     *  <div class='calendar' id='cal-heatmap'>
     <script>
     new Calendar(
     {"1429833600":0,"1429920000":0,"1430006400":0,"1430092800":0,"1430179200":0,"1430265600":0,"1430352000":0,"1430438400":0,"1430524800":0,"1430611200":0,"1430697600":0,"1430784000":0,"1430870400":0,"1430956800":0,"1431043200":0,"1431129600":0,"1431216000":0,"1431302400":0,"1431388800":0,"1431475200":0,"1431561600":0,"1431648000":0,"1431734400":0,"1431820800":0,"1431907200":0,"1431993600":0,"1432080000":0,"1432166400":0,"1432252800":0,"1432339200":0,"1432425600":0,"1432512000":0,"1432598400":0,"1432684800":0,"1432771200":0,"1432857600":0,"1432944000":0,"1433030400":0,"1433116800":0,"1433203200":0,"1433289600":0,"1433376000":0,"1433462400":0,"1433548800":0,"1433635200":0,"1433721600":0,"1433808000":0,"1433894400":0,"1433980800":0,"1434067200":0,"1434153600":0,"1434240000":0,"1434326400":0,"1434412800":0,"1434499200":0,"1434585600":0,"1434672000":0,"1434758400":0,"1434844800":0,"1434931200":0,"1435017600":0,"1435104000":0,"1435190400":0,"1435276800":0,"1435363200":0,"1435449600":0,"1435536000":0,"1435622400":0,"1435708800":0,"1435795200":0,"1435881600":0,"1435968000":0,"1436054400":0,"1436140800":0,"1436227200":0,"1436313600":0,"1436400000":0,"1436486400":0,"1436572800":0,"1436659200":0,"1436745600":0,"1436832000":0,"1436918400":0,"1437004800":0,"1437091200":0,"1437177600":0,"1437264000":0,"1437350400":0,"1437436800":0,"1437523200":0,"1437609600":0,"1437696000":0,"1437782400":0,"1437868800":0,"1437955200":0,"1438041600":0,"1438128000":0,"1438214400":0,"1438300800":0,"1438387200":0,"1438473600":0,"1438560000":0,"1438646400":0,"1438732800":0,"1438819200":0,"1438905600":0,"1438992000":0,"1439078400":0,"1439164800":0,"1439251200":0,"1439337600":0,"1439424000":0,"1439510400":0,"1439596800":0,"1439683200":0,"1439769600":0,"1439856000":0,"1439942400":0,"1440028800":0,"1440115200":0,"1440201600":0,"1440288000":0,"1440374400":0,"1440460800":0,"1440547200":0,"1440633600":0,"1440720000":0,"1440806400":0,"1440892800":0,"1440979200":0,"1441065600":0,"1441152000":0,"1441238400":0,"1441324800":0,"1441411200":0,"1441497600":0,"1441584000":0,"1441670400":0,"1441756800":0,"1441843200":0,"1441929600":0,"1442016000":0,"1442102400":0,"1442188800":0,"1442275200":0,"1442361600":0,"1442448000":0,"1442534400":0,"1442620800":0,"1442707200":0,"1442793600":0,"1442880000":0,"1442966400":0,"1443052800":0,"1443139200":0,"1443225600":0,"1443312000":0,"1443398400":0,"1443484800":0,"1443571200":0,"1443657600":0,"1443744000":0,"1443830400":0,"1443916800":0,"1444003200":0,"1444089600":0,"1444176000":0,"1444262400":0,"1444348800":0,"1444435200":0,"1444521600":0,"1444608000":0,"1444694400":0,"1444780800":0,"1444867200":0,"1444953600":0,"1445040000":0,"1445126400":0,"1445212800":0,"1445299200":0,"1445385600":0,"1445472000":0,"1445558400":0,"1445644800":0,"1445731200":0,"1445817600":0,"1445904000":0,"1445990400":0,"1446076800":0,"1446163200":0,"1446249600":0,"1446336000":0,"1446422400":0,"1446508800":0,"1446595200":0,"1446681600":0,"1446768000":0,"1446854400":0,"1446940800":0,"1447027200":0,"1447113600":0,"1447200000":0,"1447286400":0,"1447372800":0,"1447459200":0,"1447545600":0,"1447632000":0,"1447718400":0,"1447804800":0,"1447891200":0,"1447977600":0,"1448064000":0,"1448150400":0,"1448236800":0,"1448323200":0,"1448409600":0,"1448496000":0,"1448582400":0,"1448668800":0,"1448755200":0,"1448841600":0,"1448928000":0,"1449014400":0,"1449100800":0,"1449187200":0,"1449273600":0,"1449360000":0,"1449446400":0,"1449532800":0,"1449619200":0,"1449705600":0,"1449792000":0,"1449878400":0,"1449964800":0,"1450051200":0,"1450137600":0,"1450224000":0,"1450310400":0,"1450396800":0,"1450483200":0,"1450569600":0,"1450656000":0,"1450742400":0,"1450828800":0,"1450915200":0,"1451001600":0,"1451088000":0,"1451174400":0,"1451260800":0,"1451347200":0,"1451433600":0,"1451520000":0,"1451606400":0,"1451692800":0,"1451779200":0,"1451865600":0,"1451952000":0,"1452038400":0,"1452124800":0,"1452211200":0,"1452297600":0,"1452384000":0,"1452470400":0,"1452556800":0,"1452643200":0,"1452729600":0,"1452816000":0,"1452902400":0,"1452988800":0,"1453075200":0,"1453161600":0,"1453248000":0,"1453334400":0,"1453420800":0,"1453507200":0,"1453593600":0,"1453680000":0,"1453766400":0,"1453852800":0,"1453939200":0,"1454025600":0,"1454112000":0,"1454198400":0,"1454284800":0,"1454371200":0,"1454457600":0,"1454544000":0,"1454630400":0,"1454716800":0,"1454803200":0,"1454889600":0,"1454976000":0,"1455062400":0,"1455148800":0,"1455235200":0,"1455321600":0,"1455408000":0,"1455494400":0,"1455580800":0,"1455667200":0,"1455753600":0,"1455840000":0,"1455926400":0,"1456012800":0,"1456099200":0,"1456185600":0,"1456272000":0,"1456358400":0,"1456444800":0,"1456531200":0,"1456617600":0,"1456704000":0,"1456790400":0,"1456876800":0,"1456963200":0,"1457049600":0,"1457136000":0,"1457222400":0,"1457308800":0,"1457395200":0,"1457481600":0,"1457568000":0,"1457654400":0,"1457740800":0,"1457827200":0,"1457913600":0,"1458000000":0,"1458086400":0,"1458172800":0,"1458259200":0,"1458345600":0,"1458432000":0,"1458518400":0,"1458604800":0,"1458691200":0,"1458777600":0,"1458864000":0,"1458950400":0,"1459036800":0,"1459123200":0,"1459209600":0,"1459296000":0,"1459382400":0,"1459468800":0,"1459555200":0,"1459641600":0,"1459728000":54,"1459814400":861,"1459900800":405,"1459987200":3325,"1460073600":1146,"1460160000":188,"1460246400":36,"1460332800":996,"1460419200":682,"1460505600":133,"1460592000":121,"1460678400":677,"1460764800":70,"1460851200":72,"1460937600":141,"1461024000":194,"1461110400":204,"1461196800":166,"1461283200":364,"1461369600":34,"1461456000":3,"1461542400":0},
     2015,
     4,
     '/u/android_source/calendar_activities'
     );
     </script>
     </div>
     <div class='calendar-hint'>Summary of issues, merge requests, and push events</div>
     * </pre>
     *
     *
     * @param user
     * @return
     */
    @GET("/u/${userName}/calender")
    String getCalendar(@Path("userName") String user);

}
