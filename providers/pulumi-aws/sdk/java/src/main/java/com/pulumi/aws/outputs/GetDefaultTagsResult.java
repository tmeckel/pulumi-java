// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetDefaultTagsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return Blocks of default tags set on the provider. See details below.
     * 
     */
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetDefaultTagsResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.id = id;
        this.tags = tags;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Blocks of default tags set on the provider. See details below.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDefaultTagsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDefaultTagsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.tags = defaults.tags;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetDefaultTagsResult build() {
            return new GetDefaultTagsResult(id, tags);
        }
    }
}
