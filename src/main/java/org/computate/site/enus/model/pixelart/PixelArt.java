package org.computate.site.enus.model.pixelart;

import org.computate.search.wrap.Wrap;
import org.computate.site.enus.model.base.BaseModel;

/**
 * {@inheritDoc}
 * Api: true
 * Indexed: true
 * Model: true
 * Page: true
 * SuperPage.enUS: BaseModelPage
 * Map.Integer.sqlSort: 4
 * 
 * ApiTag.enUS: Pixel Art
 * ApiUri.enUS: /api/pixel-art
 * 
 * ApiMethod.enUS: Search
 * ApiMethod: GET
 * ApiMethod: PATCH
 * ApiMethod: POST
 * ApiMethod: PUTImport
 * ApiContentTypeRequest.PUTImport: image/gif
 * 
 * ApiMethod.enUS: SearchPage
 * Page.SearchPage.enUS: PixelArtPage
 * PageSuper.SearchPage.enUS: BaseModelPage
 * ApiUri.SearchPage.enUS: /pixel-art
 * 
 * Role.enUS: SiteAdmin
 * Saves: true
 * 
 * AName.enUS: a pixel art
 * Color: blue
 * IconGroup: thin
 * IconName: table-cells
 * NameVar.enUS: pixelArt
 * Rows: 10
 */
public class PixelArt extends PixelArtGen<BaseModel> {

	/**
	 * {@inheritDoc}
	 * DisplayName.enUS: base64 data
	 * Stored: true
	 * Persist: true
	 * HtmlRow: 4
	 * HtmlCell: 1
	 * ImageBase64Url.enUS: /api/pixel-art
	 */
	protected void _base64Data(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DisplayName.enUS: base64 data
	 * Persist: true
	 * DocValues: true
	 * HtmlRow: 4
	 * HtmlCell: 2
	 */
	protected void _pixelArtName(Wrap<String> w) {
	}
}
