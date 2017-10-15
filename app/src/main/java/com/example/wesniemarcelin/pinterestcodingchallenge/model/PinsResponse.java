package com.example.wesniemarcelin.pinterestcodingchallenge.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wesniemarcelin on 10/13/17.
 */

public class PinsResponse {
    public PinsResponse(List<Object> access, List<Object> additionalHideReasons, Object attribution, Board board, Object buyableProduct, int commentCount, Comments comments, String createdAt, String description, String descriptionHtml, String domain, String dominantColor, Object embed, String id, String imageSignature, boolean isDownstreamPromotion, boolean isPlayable, boolean isRepin, boolean isUploaded, boolean isVideo, int likeCount, boolean likedByMe, String link, String method, PinJoin pinJoin, Pinner pinner, Object placeSummary, String priceCurrency, float priceValue, String privacy, Object promoter, int repinCount, Object richSummary, Object sourceInterest, String title, String type, List<Object> viewTags) {
        this.access = access;
        this.additionalHideReasons = additionalHideReasons;
        this.attribution = attribution;
        this.board = board;
        this.buyableProduct = buyableProduct;
        this.commentCount = commentCount;
        this.comments = comments;
        this.createdAt = createdAt;
        this.description = description;
        this.descriptionHtml = descriptionHtml;
        this.domain = domain;
        this.dominantColor = dominantColor;
        this.embed = embed;
        this.id = id;
        this.imageSignature = imageSignature;
        this.isDownstreamPromotion = isDownstreamPromotion;
        this.isPlayable = isPlayable;
        this.isRepin = isRepin;
        this.isUploaded = isUploaded;
        this.isVideo = isVideo;
        this.likeCount = likeCount;
        this.likedByMe = likedByMe;
        this.link = link;
        this.method = method;
        this.pinJoin = pinJoin;
        this.pinner = pinner;
        this.placeSummary = placeSummary;
        this.priceCurrency = priceCurrency;
        this.priceValue = priceValue;
        this.privacy = privacy;
        this.promoter = promoter;
        this.repinCount = repinCount;
        this.richSummary = richSummary;
        this.sourceInterest = sourceInterest;
        this.title = title;
        this.type = type;
        this.viewTags = viewTags;
    }

    @SerializedName("access")
    @Expose
    private List<Object> access = null;
    @SerializedName("additional_hide_reasons")
    @Expose
    private List<Object> additionalHideReasons = null;
    @SerializedName("attribution")
    @Expose
    private Object attribution;
    @SerializedName("board")
    @Expose
    private Board board;
    @SerializedName("buyable_product")
    @Expose
    private Object buyableProduct;
    @SerializedName("comment_count")
    @Expose
    private int commentCount;
    @SerializedName("comments")
    @Expose
    private Comments comments;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("description_html")
    @Expose
    private String descriptionHtml;
    @SerializedName("domain")
    @Expose
    private String domain;
    @SerializedName("dominant_color")
    @Expose
    private String dominantColor;
    @SerializedName("embed")
    @Expose
    private Object embed;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("image_signature")
    @Expose
    private String imageSignature;
    //    @SerializedName("images")
//    @Expose
//    private Images images;
    @SerializedName("is_downstream_promotion")
    @Expose
    private boolean isDownstreamPromotion;
    @SerializedName("is_playable")
    @Expose
    private boolean isPlayable;
    @SerializedName("is_repin")
    @Expose
    private boolean isRepin;
    @SerializedName("is_uploaded")
    @Expose
    private boolean isUploaded;
    @SerializedName("is_video")
    @Expose
    private boolean isVideo;
    @SerializedName("like_count")
    @Expose
    private int likeCount;
    @SerializedName("liked_by_me")
    @Expose
    private boolean likedByMe;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("method")
    @Expose
    private String method;
    @SerializedName("pin_join")
    @Expose
    private PinJoin pinJoin;
    @SerializedName("pinner")
    @Expose
    private Pinner pinner;
    @SerializedName("place_summary")
    @Expose
    private Object placeSummary;
    @SerializedName("price_currency")
    @Expose
    private String priceCurrency;
    @SerializedName("price_value")
    @Expose
    private float priceValue;
    @SerializedName("privacy")
    @Expose
    private String privacy;
    @SerializedName("promoter")
    @Expose
    private Object promoter;
    @SerializedName("repin_count")
    @Expose
    private int repinCount;
    @SerializedName("rich_summary")
    @Expose
    private Object richSummary;
    @SerializedName("source_interest")
    @Expose
    private Object sourceInterest;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("view_tags")
    @Expose
    private List<Object> viewTags = null;


    public class Board {
        @SerializedName("followed_by_me")
        @Expose
        private boolean followedByMe;
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("image_thumbnail_url")
        @Expose
        private String imageThumbnailUrl;
        @SerializedName("is_collaborative")
        @Expose
        private boolean isCollaborative;
        @SerializedName("layout")
        @Expose
        private String layout;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("owner")
        @Expose
        private Owner owner;
        @SerializedName("privacy")
        @Expose
        private String privacy;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("url")
        @Expose
        private String url;

        public boolean isFollowedByMe() {
            return followedByMe;
        }

        public void setFollowedByMe(boolean followedByMe) {
            this.followedByMe = followedByMe;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getImageThumbnailUrl() {
            return imageThumbnailUrl;
        }

        public void setImageThumbnailUrl(String imageThumbnailUrl) {
            this.imageThumbnailUrl = imageThumbnailUrl;
        }

        public boolean isIsCollaborative() {
            return isCollaborative;
        }

        public void setIsCollaborative(boolean isCollaborative) {
            this.isCollaborative = isCollaborative;
        }

        public String getLayout() {
            return layout;
        }

        public void setLayout(String layout) {
            this.layout = layout;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Owner getOwner() {
            return owner;
        }

        public void setOwner(Owner owner) {
            this.owner = owner;
        }

        public String getPrivacy() {
            return privacy;
        }

        public void setPrivacy(String privacy) {
            this.privacy = privacy;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }


    public class CanonicalPin {

        @SerializedName("id")
        @Expose
        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

    }


    public class Comments {

        @SerializedName("bookmark")
        @Expose
        private Object bookmark;
        @SerializedName("data")
        @Expose
        private List<Object> data = null;
        @SerializedName("uri")
        @Expose
        private String uri;

        public Object getBookmark() {
            return bookmark;
        }

        public void setBookmark(Object bookmark) {
            this.bookmark = bookmark;
        }

        public List<Object> getData() {
            return data;
        }

        public void setData(List<Object> data) {
            this.data = data;
        }

        public String getUri() {
            return uri;
        }

        public void setUri(String uri) {
            this.uri = uri;
        }

    }

//    public class Images {
//
//        @SerializedName("136x136")
//@Expose
//private com.example.wesniemarcelin.pinterestcodingchallenge._136x136 _136x136;
//    @SerializedName("236x")
//    @Expose
//    private com.example.wesniemarcelin.pinterestcodingchallenge._236x _236x;
//    @SerializedName("474x")
//    @Expose
//    private com.example.wesniemarcelin.pinterestcodingchallenge._474x _474x;
//    @SerializedName("736x")
//    @Expose
//    private com.example.wesniemarcelin.pinterestcodingchallenge._736x _736x;
//    @SerializedName("orig")
//    @Expose
//    private Orig orig;
//
//        public com.example.wesniemarcelin.pinterestcodingchallenge._136x136 get136x136() {
//            return _136x136;
//        }
//
//        public void set136x136(com.example.wesniemarcelin.pinterestcodingchallenge._136x136 _136x136) {
//            this._136x136 = _136x136;
//        }
//
//        public com.example.wesniemarcelin.pinterestcodingchallenge._236x get236x() {
//            return _236x;
//        }
//
//        public void set236x(com.example.wesniemarcelin.pinterestcodingchallenge._236x _236x) {
//            this._236x = _236x;
//        }
//
//        public com.example.wesniemarcelin.pinterestcodingchallenge._474x get474x() {
//            return _474x;
//        }
//
//        public void set474x(com.example.wesniemarcelin.pinterestcodingchallenge._474x _474x) {
//            this._474x = _474x;
//        }
//
//        public com.example.wesniemarcelin.pinterestcodingchallenge._736x get736x() {
//            return _736x;
//        }
//
//        public void set736x(com.example.wesniemarcelin.pinterestcodingchallenge._736x _736x) {
//            this._736x = _736x;
//        }
//
//        public Orig getOrig() {
//            return orig;
//        }
//
//        public void setOrig(Orig orig) {
//            this.orig = orig;
//        }
//
//    }


    public class Orig {

        @SerializedName("height")
        @Expose
        private int height;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("width")
        @Expose
        private int width;

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

    }

    public class Owner {

        @SerializedName("id")
        @Expose
        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

    }


    public class PinJoin {

        @SerializedName("canonical_pin")
        @Expose
        private CanonicalPin canonicalPin;
        @SerializedName("seo_description")
        @Expose
        private String seoDescription;
        @SerializedName("visual_annotation")
        @Expose
        private List<String> visualAnnotation = null;
        @SerializedName("visual_descriptions")
        @Expose
        private List<String> visualDescriptions = null;

        public CanonicalPin getCanonicalPin() {
            return canonicalPin;
        }

        public void setCanonicalPin(CanonicalPin canonicalPin) {
            this.canonicalPin = canonicalPin;
        }

        public String getSeoDescription() {
            return seoDescription;
        }

        public void setSeoDescription(String seoDescription) {
            this.seoDescription = seoDescription;
        }

        public List<String> getVisualAnnotation() {
            return visualAnnotation;
        }

        public void setVisualAnnotation(List<String> visualAnnotation) {
            this.visualAnnotation = visualAnnotation;
        }

        public List<String> getVisualDescriptions() {
            return visualDescriptions;
        }

        public void setVisualDescriptions(List<String> visualDescriptions) {
            this.visualDescriptions = visualDescriptions;
        }

    }

    public class Pinner {

        @SerializedName("explicitly_followed_by_me")
        @Expose
        private boolean explicitlyFollowedByMe;
        @SerializedName("full_name")
        @Expose
        private String fullName;
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("image_large_url")
        @Expose
        private String imageLargeUrl;
        @SerializedName("image_small_url")
        @Expose
        private String imageSmallUrl;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("username")
        @Expose
        private String username;

        public boolean isExplicitlyFollowedByMe() {
            return explicitlyFollowedByMe;
        }

        public void setExplicitlyFollowedByMe(boolean explicitlyFollowedByMe) {
            this.explicitlyFollowedByMe = explicitlyFollowedByMe;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getImageLargeUrl() {
            return imageLargeUrl;
        }

        public void setImageLargeUrl(String imageLargeUrl) {
            this.imageLargeUrl = imageLargeUrl;
        }

        public String getImageSmallUrl() {
            return imageSmallUrl;
        }

        public void setImageSmallUrl(String imageSmallUrl) {
            this.imageSmallUrl = imageSmallUrl;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

    }

    public class _136x136 {

        @SerializedName("height")
        @Expose
        private int height;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("width")
        @Expose
        private int width;

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

    }

    public class _236x {

        @SerializedName("height")
        @Expose
        private int height;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("width")
        @Expose
        private int width;

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getWidth() {
            return width;
        }

    }


    public class _474x {

        @SerializedName("height")
        @Expose
        private int height;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("width")
        @Expose
        private int width;

        public int getHeight() {
            return height;
        }

        public String getUrl() {
            return url;
        }

        public int getWidth() {
            return width;
        }

    }


    public class _736x {

        @SerializedName("height")
        @Expose
        private int height;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("width")
        @Expose
        private int width;

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

    }


    public List<Object> getAccess() {
        return access;
    }

    public List<Object> getAdditionalHideReasons() {
        return additionalHideReasons;
    }

    public Object getAttribution() {
        return attribution;
    }

    public Board getBoard() {
        return board;
    }

    public Object getBuyableProduct() {
        return buyableProduct;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public Comments getComments() {
        return comments;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getDescription() {
        return description;
    }

    public String getDescriptionHtml() {
        return descriptionHtml;
    }

    public String getDomain() {
        return domain;
    }

    public String getDominantColor() {
        return dominantColor;
    }

    public Object getEmbed() {
        return embed;
    }

    public String getId() {
        return id;
    }

    public String getImageSignature() {
        return imageSignature;
    }

//    public Images getImages() {
//        return images;
//    }

    public boolean isDownstreamPromotion() {
        return isDownstreamPromotion;
    }

    public boolean isPlayable() {
        return isPlayable;
    }

    public boolean isRepin() {
        return isRepin;
    }

    public boolean isUploaded() {
        return isUploaded;
    }

    public boolean isVideo() {
        return isVideo;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public boolean isLikedByMe() {
        return likedByMe;
    }

    public String getLink() {
        return link;
    }

    public String getMethod() {
        return method;
    }

    public PinJoin getPinJoin() {
        return pinJoin;
    }

    public Pinner getPinner() {
        return pinner;
    }

    public Object getPlaceSummary() {
        return placeSummary;
    }

    public String getPriceCurrency() {
        return priceCurrency;
    }

    public float getPriceValue() {
        return priceValue;
    }

    public String getPrivacy() {
        return privacy;
    }

    public Object getPromoter() {
        return promoter;
    }

    public int getRepinCount() {
        return repinCount;
    }

    public Object getRichSummary() {
        return richSummary;
    }

    public Object getSourceInterest() {
        return sourceInterest;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public List<Object> getViewTags() {
        return viewTags;
    }
}
