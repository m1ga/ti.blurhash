# ti.blurhash - Blurhash placeholder images for Titanium

## What is BlurHash

<quote>BlurHash is a compact representation of a placeholder for an image.</quote>
(https://blurha.sh/)

This library allows you to convert an image to a simple string like `LEHV6nWB2yk8pyoJadR*.7kCMdnj` and that string into a preview image:

<img src="assets/img1.jpg" height="170" width="270"/> → `LEHV6nWB2yk8pyoJadR*.7kCMdnj` → <img src="assets/preview.png" height="170" width="270"/><br/>



You app can use those preview images instead of a white or loading spinner.

This Titanium module will use the library from https://github.com/woltapp/blurhash


## How to use it:

<i>Currently Android only</i>

```javascript
var win = Ti.UI.createWindow();

var img = Ti.UI.createImageView({
	width: 200,
	height: 200,
	image: require("ti.blurhash").decode({
		width: 200,
		height: 200,
		text: "LEHV6nWB2yk8pyoJadR*.7kCMdnj"
	})
})
win.add(img);
win.open();
```

## Methods

* decode(width:int, height:int, punch:float, useCache:boolen)
    - punch can improve the contrast; default: 1


## Author

- Michael Gangolf ([@MichaelGangolf](https://twitter.com/MichaelGangolf) / [Web](http://migaweb.de))

<span class="badge-buymeacoffee"><a href="https://www.buymeacoffee.com/miga" title="donate"><img src="https://img.shields.io/badge/buy%20me%20a%20coke-donate-orange.svg" alt="Buy Me A Coke donate button" /></a></span>
