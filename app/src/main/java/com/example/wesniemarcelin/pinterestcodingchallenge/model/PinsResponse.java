package com.example.wesniemarcelin.pinterestcodingchallenge.model;

import java.util.List;

/**
 * Created by wesniemarcelin on 10/13/17.
 */

public class PinsResponse {
    private List<Object> access = null;
    private List<Object> additionalHideReasons = null;
    private Object attribution;
    private Board board;
    private Object buyableProduct;
    private int commentCount;
    private Comments comments;
    private String createdAt;
    private String description;
    private String descriptionHtml;
    private String domain;
    private String dominantColor;
    private Object embed;
    private String id;
    private String imageSignature;
//    private Images images;
    private boolean isDownstreamPromotion;
    private boolean isPlayable;
    private boolean isRepin;
    private boolean isUploaded;
    private boolean isVideo;
    private int likeCount;
    private boolean likedByMe;
    private String link;
    private String method;
    private PinJoin pinJoin;
    private Pinner pinner;
    private Object placeSummary;
    private String priceCurrency;
    private float priceValue;
    private String privacy;
    private Object promoter;
    private int repinCount;
    private Object richSummary;
    private Object sourceInterest;
    private String title;
    private String type;
    private List<Object> viewTags = null;



    public class Board {

        private boolean followedByMe;
        private String id;
        private String imageThumbnailUrl;
        private boolean isCollaborative;
        private String layout;
        private String name;
        private Owner owner;
        private String privacy;
        private String type;
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

        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

    }


    public class Comments {

        private Object bookmark;
        private List<Object> data = null;
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
//        private com.example.wesniemarcelin.pinterestcodingchallenge._136x136 _136x136;
//        private com.example.wesniemarcelin.pinterestcodingchallenge._236x _236x;
//        private com.example.wesniemarcelin.pinterestcodingchallenge._474x _474x;
//        private com.example.wesniemarcelin.pinterestcodingchallenge._736x _736x;
//        private Orig orig;
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

        private int height;
        private String url;
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

        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

    }


    public class PinJoin {

        private CanonicalPin canonicalPin;
        private String seoDescription;
        private List<String> visualAnnotation = null;
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

        private boolean explicitlyFollowedByMe;
        private String fullName;
        private String id;
        private String imageLargeUrl;
        private String imageSmallUrl;
        private String type;
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

        private int height;
        private String url;
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

        private int height;
        private String url;
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

        private int height;
        private String url;
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

        private int height;
        private String url;
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
