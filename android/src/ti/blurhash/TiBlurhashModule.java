/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2018 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package ti.blurhash;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.titanium.TiApplication;
import org.appcelerator.titanium.TiBlob;
import org.appcelerator.titanium.util.TiConvert;

@Kroll.module(name="TiBlurhash", id="ti.blurhash")
public class TiBlurhashModule extends KrollModule
{
	public TiBlurhashModule()
	{
		super();
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app)	{}

	// Methods
	@Kroll.method
	public TiBlob decode(KrollDict opt)
	{
		int width = TiConvert.toInt(opt.getInt("width"), 100);
		int height = TiConvert.toInt(opt.getInt("height"), 100);
		float punch = TiConvert.toFloat(opt.getDouble("punch"), 1.0f);
		boolean useCache = TiConvert.toBoolean(opt.getBoolean("useCache"), true);
		String txt = opt.getString("text");
		TiBlob blob = null;

		try {
			blob = TiBlob.blobFromImage(BlurHashDecoder.decode(txt, width, height, punch, useCache));
		} catch (Exception e) {
			// error
		}
		
		return blob;
	}
}

