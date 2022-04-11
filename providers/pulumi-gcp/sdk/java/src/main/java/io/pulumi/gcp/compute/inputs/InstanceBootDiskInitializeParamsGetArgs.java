// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceBootDiskInitializeParamsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceBootDiskInitializeParamsGetArgs Empty = new InstanceBootDiskInitializeParamsGetArgs();

    /**
     * The image from which to initialize this disk. This can be
     * one of: the image's `self_link`, `projects/{project}/global/images/{image}`,
     * `projects/{project}/global/images/family/{family}`, `global/images/{image}`,
     * `global/images/family/{family}`, `family/{family}`, `{project}/{family}`,
     * `{project}/{image}`, `{family}`, or `{image}`. If referred by family, the
     * images names must include the family name. If they don't, use the
     * [gcp.compute.Image data source](https://www.terraform.io/docs/providers/google/d/compute_image.html).
     * For instance, the image `centos-6-v20180104` includes its family name `centos-6`.
     * These images can be referred by family name here.
     * 
     */
    @Import(name="image")
      private final @Nullable Output<String> image;

    public Output<String> getImage() {
        return this.image == null ? Codegen.empty() : this.image;
    }

    /**
     * A map of key/value label pairs to assign to the instance.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,Object>> labels;

    public Output<Map<String,Object>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * The size of the image in gigabytes. If not specified, it
     * will inherit the size of its base image.
     * 
     */
    @Import(name="size")
      private final @Nullable Output<Integer> size;

    public Output<Integer> getSize() {
        return this.size == null ? Codegen.empty() : this.size;
    }

    /**
     * The type of reservation from which this instance can consume resources.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public InstanceBootDiskInitializeParamsGetArgs(
        @Nullable Output<String> image,
        @Nullable Output<Map<String,Object>> labels,
        @Nullable Output<Integer> size,
        @Nullable Output<String> type) {
        this.image = image;
        this.labels = labels;
        this.size = size;
        this.type = type;
    }

    private InstanceBootDiskInitializeParamsGetArgs() {
        this.image = Codegen.empty();
        this.labels = Codegen.empty();
        this.size = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceBootDiskInitializeParamsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> image;
        private @Nullable Output<Map<String,Object>> labels;
        private @Nullable Output<Integer> size;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceBootDiskInitializeParamsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.image = defaults.image;
    	      this.labels = defaults.labels;
    	      this.size = defaults.size;
    	      this.type = defaults.type;
        }

        public Builder image(@Nullable Output<String> image) {
            this.image = image;
            return this;
        }
        public Builder image(@Nullable String image) {
            this.image = Codegen.ofNullable(image);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,Object> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder size(@Nullable Output<Integer> size) {
            this.size = size;
            return this;
        }
        public Builder size(@Nullable Integer size) {
            this.size = Codegen.ofNullable(size);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public InstanceBootDiskInitializeParamsGetArgs build() {
            return new InstanceBootDiskInitializeParamsGetArgs(image, labels, size, type);
        }
    }
}
