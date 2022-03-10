// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vision_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetReferenceImageArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetReferenceImageArgs Empty = new GetReferenceImageArgs();

    @InputImport(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="productId", required=true)
      private final String productId;

    public String getProductId() {
        return this.productId;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="referenceImageId", required=true)
      private final String referenceImageId;

    public String getReferenceImageId() {
        return this.referenceImageId;
    }

    public GetReferenceImageArgs(
        String location,
        String productId,
        @Nullable String project,
        String referenceImageId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.productId = Objects.requireNonNull(productId, "expected parameter 'productId' to be non-null");
        this.project = project;
        this.referenceImageId = Objects.requireNonNull(referenceImageId, "expected parameter 'referenceImageId' to be non-null");
    }

    private GetReferenceImageArgs() {
        this.location = null;
        this.productId = null;
        this.project = null;
        this.referenceImageId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReferenceImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private String productId;
        private @Nullable String project;
        private String referenceImageId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReferenceImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.productId = defaults.productId;
    	      this.project = defaults.project;
    	      this.referenceImageId = defaults.referenceImageId;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder productId(String productId) {
            this.productId = Objects.requireNonNull(productId);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder referenceImageId(String referenceImageId) {
            this.referenceImageId = Objects.requireNonNull(referenceImageId);
            return this;
        }
        public GetReferenceImageArgs build() {
            return new GetReferenceImageArgs(location, productId, project, referenceImageId);
        }
    }
}
