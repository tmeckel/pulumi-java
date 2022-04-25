// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ResourceNavigationLink resource.
 * 
 */
public final class ResourceNavigationLinkResponse extends com.pulumi.resources.InvokeArgs {

    public static final ResourceNavigationLinkResponse Empty = new ResourceNavigationLinkResponse();

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag", required=true)
    private String etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * Link to the external resource.
     * 
     */
    @Import(name="link")
    private @Nullable String link;

    /**
     * @return Link to the external resource.
     * 
     */
    public Optional<String> link() {
        return Optional.ofNullable(this.link);
    }

    /**
     * Resource type of the linked resource.
     * 
     */
    @Import(name="linkedResourceType")
    private @Nullable String linkedResourceType;

    /**
     * @return Resource type of the linked resource.
     * 
     */
    public Optional<String> linkedResourceType() {
        return Optional.ofNullable(this.linkedResourceType);
    }

    /**
     * Name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The provisioning state of the resource navigation link resource.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    /**
     * @return The provisioning state of the resource navigation link resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Resource type.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    private ResourceNavigationLinkResponse() {}

    private ResourceNavigationLinkResponse(ResourceNavigationLinkResponse $) {
        this.etag = $.etag;
        this.id = $.id;
        this.link = $.link;
        this.linkedResourceType = $.linkedResourceType;
        this.name = $.name;
        this.provisioningState = $.provisioningState;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceNavigationLinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceNavigationLinkResponse $;

        public Builder() {
            $ = new ResourceNavigationLinkResponse();
        }

        public Builder(ResourceNavigationLinkResponse defaults) {
            $ = new ResourceNavigationLinkResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param etag A unique read-only string that changes whenever the resource is updated.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param link Link to the external resource.
         * 
         * @return builder
         * 
         */
        public Builder link(@Nullable String link) {
            $.link = link;
            return this;
        }

        /**
         * @param linkedResourceType Resource type of the linked resource.
         * 
         * @return builder
         * 
         */
        public Builder linkedResourceType(@Nullable String linkedResourceType) {
            $.linkedResourceType = linkedResourceType;
            return this;
        }

        /**
         * @param name Name of the resource that is unique within a resource group. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param provisioningState The provisioning state of the resource navigation link resource.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        /**
         * @param type Resource type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public ResourceNavigationLinkResponse build() {
            $.etag = Objects.requireNonNull($.etag, "expected parameter 'etag' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
