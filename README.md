Android Snap
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
