// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class GetLaunchTemplateTagSpecification extends io.pulumi.resources.InvokeArgs {

    public static final GetLaunchTemplateTagSpecification Empty = new GetLaunchTemplateTagSpecification();

    @InputImport(name="resourceType", required=true)
      private final String resourceType;

    public String getPropResourceType() {
        return this.resourceType;
    }

    /**
     * A map of tags, each pair of which must exactly match a pair on the desired Launch Template.
     * 
     */
    @InputImport(name="tags", required=true)
      private final Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags;
    }

    public GetLaunchTemplateTagSpecification(
        String resourceType,
        Map<String,String> tags) {
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
        this.tags = Objects.requireNonNull(tags, "expected parameter 'tags' to be non-null");
    }

    private GetLaunchTemplateTagSpecification() {
        this.resourceType = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchTemplateTagSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceType;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchTemplateTagSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceType = defaults.resourceType;
    	      this.tags = defaults.tags;
        }

        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetLaunchTemplateTagSpecification build() {
            return new GetLaunchTemplateTagSpecification(resourceType, tags);
        }
    }
}
