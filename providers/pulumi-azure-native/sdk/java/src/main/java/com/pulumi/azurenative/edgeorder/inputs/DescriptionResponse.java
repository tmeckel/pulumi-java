// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.edgeorder.inputs;

import com.pulumi.azurenative.edgeorder.inputs.LinkResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Description related properties of a product system.
 * 
 */
public final class DescriptionResponse extends com.pulumi.resources.InvokeArgs {

    public static final DescriptionResponse Empty = new DescriptionResponse();

    /**
     * Attributes for the product system.
     * 
     */
    @Import(name="attributes", required=true)
    private List<String> attributes;

    /**
     * @return Attributes for the product system.
     * 
     */
    public List<String> attributes() {
        return this.attributes;
    }

    /**
     * Type of description.
     * 
     */
    @Import(name="descriptionType", required=true)
    private String descriptionType;

    /**
     * @return Type of description.
     * 
     */
    public String descriptionType() {
        return this.descriptionType;
    }

    /**
     * Keywords for the product system.
     * 
     */
    @Import(name="keywords", required=true)
    private List<String> keywords;

    /**
     * @return Keywords for the product system.
     * 
     */
    public List<String> keywords() {
        return this.keywords;
    }

    /**
     * Links for the product system.
     * 
     */
    @Import(name="links", required=true)
    private List<LinkResponse> links;

    /**
     * @return Links for the product system.
     * 
     */
    public List<LinkResponse> links() {
        return this.links;
    }

    /**
     * Long description of the product system.
     * 
     */
    @Import(name="longDescription", required=true)
    private String longDescription;

    /**
     * @return Long description of the product system.
     * 
     */
    public String longDescription() {
        return this.longDescription;
    }

    /**
     * Short description of the product system.
     * 
     */
    @Import(name="shortDescription", required=true)
    private String shortDescription;

    /**
     * @return Short description of the product system.
     * 
     */
    public String shortDescription() {
        return this.shortDescription;
    }

    private DescriptionResponse() {}

    private DescriptionResponse(DescriptionResponse $) {
        this.attributes = $.attributes;
        this.descriptionType = $.descriptionType;
        this.keywords = $.keywords;
        this.links = $.links;
        this.longDescription = $.longDescription;
        this.shortDescription = $.shortDescription;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DescriptionResponse $;

        public Builder() {
            $ = new DescriptionResponse();
        }

        public Builder(DescriptionResponse defaults) {
            $ = new DescriptionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param attributes Attributes for the product system.
         * 
         * @return builder
         * 
         */
        public Builder attributes(List<String> attributes) {
            $.attributes = attributes;
            return this;
        }

        /**
         * @param attributes Attributes for the product system.
         * 
         * @return builder
         * 
         */
        public Builder attributes(String... attributes) {
            return attributes(List.of(attributes));
        }

        /**
         * @param descriptionType Type of description.
         * 
         * @return builder
         * 
         */
        public Builder descriptionType(String descriptionType) {
            $.descriptionType = descriptionType;
            return this;
        }

        /**
         * @param keywords Keywords for the product system.
         * 
         * @return builder
         * 
         */
        public Builder keywords(List<String> keywords) {
            $.keywords = keywords;
            return this;
        }

        /**
         * @param keywords Keywords for the product system.
         * 
         * @return builder
         * 
         */
        public Builder keywords(String... keywords) {
            return keywords(List.of(keywords));
        }

        /**
         * @param links Links for the product system.
         * 
         * @return builder
         * 
         */
        public Builder links(List<LinkResponse> links) {
            $.links = links;
            return this;
        }

        /**
         * @param links Links for the product system.
         * 
         * @return builder
         * 
         */
        public Builder links(LinkResponse... links) {
            return links(List.of(links));
        }

        /**
         * @param longDescription Long description of the product system.
         * 
         * @return builder
         * 
         */
        public Builder longDescription(String longDescription) {
            $.longDescription = longDescription;
            return this;
        }

        /**
         * @param shortDescription Short description of the product system.
         * 
         * @return builder
         * 
         */
        public Builder shortDescription(String shortDescription) {
            $.shortDescription = shortDescription;
            return this;
        }

        public DescriptionResponse build() {
            $.attributes = Objects.requireNonNull($.attributes, "expected parameter 'attributes' to be non-null");
            $.descriptionType = Objects.requireNonNull($.descriptionType, "expected parameter 'descriptionType' to be non-null");
            $.keywords = Objects.requireNonNull($.keywords, "expected parameter 'keywords' to be non-null");
            $.links = Objects.requireNonNull($.links, "expected parameter 'links' to be non-null");
            $.longDescription = Objects.requireNonNull($.longDescription, "expected parameter 'longDescription' to be non-null");
            $.shortDescription = Objects.requireNonNull($.shortDescription, "expected parameter 'shortDescription' to be non-null");
            return $;
        }
    }

}
