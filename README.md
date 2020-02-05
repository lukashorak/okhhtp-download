# okhttp-download

## Create JAR with dependencies

`gradlew.bar shadowJar`

## Use in Pentaho


    import com.luki.ClientWrapper
    
    String url = "https://www.idx.co.id/umbraco/Surface/StockData/GetSecuritiesStock?board=PENGEMBANGAN&draw=3&start=0&length=100";

    //Without proxy
    String result1 = clientWrapper.get(url);
    //With Proxy
    String result2 = clientWrapper.getWithProxy(url,"localhost",8888);
