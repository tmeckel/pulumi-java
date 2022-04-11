// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Metadata for a Spanner connector used by the job.
 * 
 */
public final class SpannerIODetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpannerIODetailsArgs Empty = new SpannerIODetailsArgs();

    /**
     * DatabaseId accessed in the connection.
     * 
     */
    @Import(name="databaseId")
      private final @Nullable Output<String> databaseId;

    public Output<String> getDatabaseId() {
        return this.databaseId == null ? Codegen.empty() : this.databaseId;
    }

    /**
     * InstanceId accessed in the connection.
     * 
     */
    @Import(name="instanceId")
      private final @Nullable Output<String> instanceId;

    public Output<String> getInstanceId() {
        return this.instanceId == null ? Codegen.empty() : this.instanceId;
    }

    /**
     * ProjectId accessed in the connection.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public SpannerIODetailsArgs(
        @Nullable Output<String> databaseId,
        @Nullable Output<String> instanceId,
        @Nullable Output<String> project) {
        this.databaseId = databaseId;
        this.instanceId = instanceId;
        this.project = project;
    }

    private SpannerIODetailsArgs() {
        this.databaseId = Codegen.empty();
        this.instanceId = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpannerIODetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> databaseId;
        private @Nullable Output<String> instanceId;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(SpannerIODetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseId = defaults.databaseId;
    	      this.instanceId = defaults.instanceId;
    	      this.project = defaults.project;
        }

        public Builder databaseId(@Nullable Output<String> databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public Builder databaseId(@Nullable String databaseId) {
            this.databaseId = Codegen.ofNullable(databaseId);
            return this;
        }
        public Builder instanceId(@Nullable Output<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Builder instanceId(@Nullable String instanceId) {
            this.instanceId = Codegen.ofNullable(instanceId);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public SpannerIODetailsArgs build() {
            return new SpannerIODetailsArgs(databaseId, instanceId, project);
        }
    }
}
