// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs Empty = new PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs();

    /**
     * If not empty, the ID of the namespace to which the entities belong.
     * 
     */
    @InputImport(name="namespaceId")
      private final @Nullable Input<String> namespaceId;

    public Input<String> getNamespaceId() {
        return this.namespaceId == null ? Input.empty() : this.namespaceId;
    }

    /**
     * The Google Cloud Platform project ID of the project containing the table.
     * 
     */
    @InputImport(name="projectId", required=true)
      private final Input<String> projectId;

    public Input<String> getProjectId() {
        return this.projectId;
    }

    public PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs(
        @Nullable Input<String> namespaceId,
        Input<String> projectId) {
        this.namespaceId = namespaceId;
        this.projectId = Objects.requireNonNull(projectId, "expected parameter 'projectId' to be non-null");
    }

    private PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs() {
        this.namespaceId = Input.empty();
        this.projectId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> namespaceId;
        private Input<String> projectId;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespaceId = defaults.namespaceId;
    	      this.projectId = defaults.projectId;
        }

        public Builder namespaceId(@Nullable Input<String> namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }

        public Builder namespaceId(@Nullable String namespaceId) {
            this.namespaceId = Input.ofNullable(namespaceId);
            return this;
        }

        public Builder projectId(Input<String> projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }

        public Builder projectId(String projectId) {
            this.projectId = Input.of(Objects.requireNonNull(projectId));
            return this;
        }
        public PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs build() {
            return new PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs(namespaceId, projectId);
        }
    }
}
