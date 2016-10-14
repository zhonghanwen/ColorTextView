# ColorTextView
mark some phrase with colors

# ScreenShot
![](https://github.com/zhonghanwen/ColorTextView/blob/master/img/wx_20161013205939.png)

# Code
```xml
    //xml
    <com.zhw.cmcm.ColorTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:color_texts="500|WIFI"
        app:color_arrays="#93E65A|#EC3F22"
        android:text="You can get 500 credits after connect and share the WIFI"/>
```

```java
    //java
    ((ColorTextView)findViewById(R.id.ctv_text))
                    .findAndSetStrColor("You", "#ff8000")
                    .findAndSetStrColor("can", "#008888");
```

# License

    Copyright 2016 zhonghanwen
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
       http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
