package com.example.wesniemarcelin.pinterestcodingchallenge.model;

import java.util.List;

/**
 * Created by wesniemarcelin on 10/13/17.
 */

public class PinsResponse {



    public class Board {

        private Boolean followedByMe;
        private String id;
        private String imageThumbnailUrl;
        private Boolean isCollaborative;
        private String layout;
        private String name;
        private Owner owner;
        private String privacy;
        private String type;
        private String url;

        public Boolean getFollowedByMe() {
            return followedByMe;
        }

        public void setFollowedByMe(Boolean followedByMe) {
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

        public Boolean getIsCollaborative() {
            return isCollaborative;
        }

        public void setIsCollaborative(Boolean isCollaborative) {
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
////        private com.example.wesniemarcelin.pinterestcodingchallenge._136x136 _136x136;
////        private com.example.wesniemarcelin.pinterestcodingchallenge._236x _236x;
////        private com.example.wesniemarcelin.pinterestcodingchallenge._474x _474x;
////        private com.example.wesniemarcelin.pinterestcodingchallenge._736x _736x;
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

        private Integer height;
        private String url;
        private Integer width;

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
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


    public class Pin {

        private List<Object> access = null;
        private List<Object> additionalHideReasons = null;
        private Object attribution;
        private Board board;
        private Object buyableProduct;
        private Integer commentCount;
        private Comments comments;
        private String createdAt;
        private String description;
        private String descriptionHtml;
        private String domain;
        private String dominantColor;
        private Object embed;
        private String id;
        private String imageSignature;
//        private Images images;
        private Boolean isDownstreamPromotion;
        private Boolean isPlayable;
        private Boolean isRepin;
        private Boolean isUploaded;
        private Boolean isVideo;
        private Integer likeCount;
        private Boolean likedByMe;
        private String link;
        private String method;
        private PinJoin pinJoin;
        private Pinner pinner;
        private Object placeSummary;
        private String priceCurrency;
        private Float priceValue;
        private String privacy;
        private Object promoter;
        private Integer repinCount;
        private Object richSummary;
        private Object sourceInterest;
        private String title;
        private String type;
        private List<Object> viewTags = null;

        public List<Object> getAccess() {
            return access;
        }

        public void setAccess(List<Object> access) {
            this.access = access;
        }

        public List<Object> getAdditionalHideReasons() {
            return additionalHideReasons;
        }

        public void setAdditionalHideReasons(List<Object> additionalHideReasons) {
            this.additionalHideReasons = additionalHideReasons;
        }

        public Object getAttribution() {
            return attribution;
        }

        public void setAttribution(Object attribution) {
            this.attribution = attribution;
        }

        public Board getBoard() {
            return board;
        }

        public void setBoard(Board board) {
            this.board = board;
        }

        public Object getBuyableProduct() {
            return buyableProduct;
        }

        public void setBuyableProduct(Object buyableProduct) {
            this.buyableProduct = buyableProduct;
        }

        public Integer getCommentCount() {
            return commentCount;
        }

        public void setCommentCount(Integer commentCount) {
            this.commentCount = commentCount;
        }

        public Comments getComments() {
            return comments;
        }

        public void setComments(Comments comments) {
            this.comments = comments;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getDescriptionHtml() {
            return descriptionHtml;
        }

        public void setDescriptionHtml(String descriptionHtml) {
            this.descriptionHtml = descriptionHtml;
        }

        public String getDomain() {
            return domain;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }

        public String getDominantColor() {
            return dominantColor;
        }

        public void setDominantColor(String dominantColor) {
            this.dominantColor = dominantColor;
        }

        public Object getEmbed() {
            return embed;
        }

        public void setEmbed(Object embed) {
            this.embed = embed;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getImageSignature() {
            return imageSignature;
        }

        public void setImageSignature(String imageSignature) {
            this.imageSignature = imageSignature;
        }

//        public Images getImages() {
//            return images;
//        }
//
//        public void setImages(Images images) {
//            this.images = images;
//        }

        public Boolean getIsDownstreamPromotion() {
            return isDownstreamPromotion;
        }

        public void setIsDownstreamPromotion(Boolean isDownstreamPromotion) {
            this.isDownstreamPromotion = isDownstreamPromotion;
        }

        public Boolean getIsPlayable() {
            return isPlayable;
        }

        public void setIsPlayable(Boolean isPlayable) {
            this.isPlayable = isPlayable;
        }

        public Boolean getIsRepin() {
            return isRepin;
        }

        public void setIsRepin(Boolean isRepin) {
            this.isRepin = isRepin;
        }

        public Boolean getIsUploaded() {
            return isUploaded;
        }

        public void setIsUploaded(Boolean isUploaded) {
            this.isUploaded = isUploaded;
        }

        public Boolean getIsVideo() {
            return isVideo;
        }

        public void setIsVideo(Boolean isVideo) {
            this.isVideo = isVideo;
        }

        public Integer getLikeCount() {
            return likeCount;
        }

        public void setLikeCount(Integer likeCount) {
            this.likeCount = likeCount;
        }

        public Boolean getLikedByMe() {
            return likedByMe;
        }

        public void setLikedByMe(Boolean likedByMe) {
            this.likedByMe = likedByMe;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getMethod() {
            return method;
        }

        public void setMethod(String method) {
            this.method = method;
        }

        public PinJoin getPinJoin() {
            return pinJoin;
        }

        public void setPinJoin(PinJoin pinJoin) {
            this.pinJoin = pinJoin;
        }

        public Pinner getPinner() {
            return pinner;
        }

        public void setPinner(Pinner pinner) {
            this.pinner = pinner;
        }

        public Object getPlaceSummary() {
            return placeSummary;
        }

        public void setPlaceSummary(Object placeSummary) {
            this.placeSummary = placeSummary;
        }

        public String getPriceCurrency() {
            return priceCurrency;
        }

        public void setPriceCurrency(String priceCurrency) {
            this.priceCurrency = priceCurrency;
        }

        public Float getPriceValue() {
            return priceValue;
        }

        public void setPriceValue(Float priceValue) {
            this.priceValue = priceValue;
        }

        public String getPrivacy() {
            return privacy;
        }

        public void setPrivacy(String privacy) {
            this.privacy = privacy;
        }

        public Object getPromoter() {
            return promoter;
        }

        public void setPromoter(Object promoter) {
            this.promoter = promoter;
        }

        public Integer getRepinCount() {
            return repinCount;
        }

        public void setRepinCount(Integer repinCount) {
            this.repinCount = repinCount;
        }

        public Object getRichSummary() {
            return richSummary;
        }

        public void setRichSummary(Object richSummary) {
            this.richSummary = richSummary;
        }

        public Object getSourceInterest() {
            return sourceInterest;
        }

        public void setSourceInterest(Object sourceInterest) {
            this.sourceInterest = sourceInterest;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public List<Object> getViewTags() {
            return viewTags;
        }

        public void setViewTags(List<Object> viewTags) {
            this.viewTags = viewTags;
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

        private Boolean explicitlyFollowedByMe;
        private String fullName;
        private String id;
        private String imageLargeUrl;
        private String imageSmallUrl;
        private String type;
        private String username;

        public Boolean getExplicitlyFollowedByMe() {
            return explicitlyFollowedByMe;
        }

        public void setExplicitlyFollowedByMe(Boolean explicitlyFollowedByMe) {
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

        private Integer height;
        private String url;
        private Integer width;

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

    }

    public class _236x {

        private Integer height;
        private String url;
        private Integer width;

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

    }


    public class _474x {

        private Integer height;
        private String url;
        private Integer width;

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

    }


    public class _736x {

        private Integer height;
        private String url;
        private Integer width;

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

    }


}
