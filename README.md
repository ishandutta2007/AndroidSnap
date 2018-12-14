Android Snap [![Build Status](https://travis-ci.org/mhsjlw/AndroidSnap.svg)](https://travis-ci.org/mhsjlw/AndroidSnap)
============

SnapChat clone written in Android, based off of the Treehouse tutorial!

## Usage / Running your own
To run this application you need a [parse.com](https://parse.com/) account. Then you need to open `SnapApplication.java` and replace the `APPLICATION_ID` and `CLIENT_KEY` with your credentials.

```java
package me.mhsjlw.android_snap;

import ...

public class SnapApplication extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
	    Parse.initialize(this, "APPLICATION_ID", "CLIENT_KEY");
	}
}
```

## License
See the [LICENSE](https://github.com/mhsjlw/AndroidSnap/blob/master/LICENSE) file

### Support:

If you want the good work to continue please support us on

* [PAYPAL](https://www.paypal.me/ishandutta2007)
* [BITCOIN ADDRESS: 3LZazKXG18Hxa3LLNAeKYZNtLzCxpv1LyD](https://www.coinbase.com/join/5a8e4a045b02c403bc3a9c0c)
