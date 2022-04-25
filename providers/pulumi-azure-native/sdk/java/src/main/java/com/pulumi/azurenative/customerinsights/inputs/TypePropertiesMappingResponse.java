// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Metadata for a Link&#39;s property mapping.
 * 
 */
public final class TypePropertiesMappingResponse extends com.pulumi.resources.InvokeArgs {

    public static final TypePropertiesMappingResponse Empty = new TypePropertiesMappingResponse();

    /**
     * Link type.
     * 
     */
    @Import(name="linkType")
    private @Nullable String linkType;

    /**
     * @return Link type.
     * 
     */
    public Optional<String> linkType() {
        return Optional.ofNullable(this.linkType);
    }

    /**
     *  Property name on the source Entity Type.
     * 
     */
    @Import(name="sourcePropertyName", required=true)
    private String sourcePropertyName;

    /**
     * @return  Property name on the source Entity Type.
     * 
     */
    public String sourcePropertyName() {
        return this.sourcePropertyName;
    }

    /**
     * Property name on the target Entity Type.
     * 
     */
    @Import(name="targetPropertyName", required=true)
    private String targetPropertyName;

    /**
     * @return Property name on the target Entity Type.
     * 
     */
    public String targetPropertyName() {
        return this.targetPropertyName;
    }

    private TypePropertiesMappingResponse() {}

    private TypePropertiesMappingResponse(TypePropertiesMappingResponse $) {
        this.linkType = $.linkType;
        this.sourcePropertyName = $.sourcePropertyName;
        this.targetPropertyName = $.targetPropertyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TypePropertiesMappingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TypePropertiesMappingResponse $;

        public Builder() {
            $ = new TypePropertiesMappingResponse();
        }

        public Builder(TypePropertiesMappingResponse defaults) {
            $ = new TypePropertiesMappingResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param linkType Link type.
         * 
         * @return builder
         * 
         */
        public Builder linkType(@Nullable String linkType) {
            $.linkType = linkType;
            return this;
        }

        /**
         * @param sourcePropertyName  Property name on the source Entity Type.
         * 
         * @return builder
         * 
         */
        public Builder sourcePropertyName(String sourcePropertyName) {
            $.sourcePropertyName = sourcePropertyName;
            return this;
        }

        /**
         * @param targetPropertyName Property name on the target Entity Type.
         * 
         * @return builder
         * 
         */
        public Builder targetPropertyName(String targetPropertyName) {
            $.targetPropertyName = targetPropertyName;
            return this;
        }

        public TypePropertiesMappingResponse build() {
            $.sourcePropertyName = Objects.requireNonNull($.sourcePropertyName, "expected parameter 'sourcePropertyName' to be non-null");
            $.targetPropertyName = Objects.requireNonNull($.targetPropertyName, "expected parameter 'targetPropertyName' to be non-null");
            return $;
        }
    }

}
