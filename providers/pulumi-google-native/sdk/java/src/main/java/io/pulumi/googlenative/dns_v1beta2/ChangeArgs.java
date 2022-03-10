// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dns_v1beta2.enums.ChangeStatus;
import io.pulumi.googlenative.dns_v1beta2.inputs.ResourceRecordSetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ChangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final ChangeArgs Empty = new ChangeArgs();

    /**
     * Which ResourceRecordSets to add?
     * 
     */
    @InputImport(name="additions")
      private final @Nullable Input<List<ResourceRecordSetArgs>> additions;

    public Input<List<ResourceRecordSetArgs>> getAdditions() {
        return this.additions == null ? Input.empty() : this.additions;
    }

    @InputImport(name="clientOperationId")
      private final @Nullable Input<String> clientOperationId;

    public Input<String> getClientOperationId() {
        return this.clientOperationId == null ? Input.empty() : this.clientOperationId;
    }

    /**
     * Which ResourceRecordSets to remove? Must match existing data exactly.
     * 
     */
    @InputImport(name="deletions")
      private final @Nullable Input<List<ResourceRecordSetArgs>> deletions;

    public Input<List<ResourceRecordSetArgs>> getDeletions() {
        return this.deletions == null ? Input.empty() : this.deletions;
    }

    /**
     * Unique identifier for the resource; defined by the server (output only).
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * If the DNS queries for the zone will be served.
     * 
     */
    @InputImport(name="isServing")
      private final @Nullable Input<Boolean> isServing;

    public Input<Boolean> getIsServing() {
        return this.isServing == null ? Input.empty() : this.isServing;
    }

    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    @InputImport(name="managedZone", required=true)
      private final Input<String> managedZone;

    public Input<String> getManagedZone() {
        return this.managedZone;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The time that this operation was started by the server (output only). This is in RFC3339 text format.
     * 
     */
    @InputImport(name="startTime")
      private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    /**
     * Status of the operation (output only). A status of "done" means that the request to update the authoritative servers has been sent, but the servers might not be updated yet.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<ChangeStatus> status;

    public Input<ChangeStatus> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public ChangeArgs(
        @Nullable Input<List<ResourceRecordSetArgs>> additions,
        @Nullable Input<String> clientOperationId,
        @Nullable Input<List<ResourceRecordSetArgs>> deletions,
        @Nullable Input<String> id,
        @Nullable Input<Boolean> isServing,
        @Nullable Input<String> kind,
        Input<String> managedZone,
        @Nullable Input<String> project,
        @Nullable Input<String> startTime,
        @Nullable Input<ChangeStatus> status) {
        this.additions = additions;
        this.clientOperationId = clientOperationId;
        this.deletions = deletions;
        this.id = id;
        this.isServing = isServing;
        this.kind = kind;
        this.managedZone = Objects.requireNonNull(managedZone, "expected parameter 'managedZone' to be non-null");
        this.project = project;
        this.startTime = startTime;
        this.status = status;
    }

    private ChangeArgs() {
        this.additions = Input.empty();
        this.clientOperationId = Input.empty();
        this.deletions = Input.empty();
        this.id = Input.empty();
        this.isServing = Input.empty();
        this.kind = Input.empty();
        this.managedZone = Input.empty();
        this.project = Input.empty();
        this.startTime = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ResourceRecordSetArgs>> additions;
        private @Nullable Input<String> clientOperationId;
        private @Nullable Input<List<ResourceRecordSetArgs>> deletions;
        private @Nullable Input<String> id;
        private @Nullable Input<Boolean> isServing;
        private @Nullable Input<String> kind;
        private Input<String> managedZone;
        private @Nullable Input<String> project;
        private @Nullable Input<String> startTime;
        private @Nullable Input<ChangeStatus> status;

        public Builder() {
    	      // Empty
        }

        public Builder(ChangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additions = defaults.additions;
    	      this.clientOperationId = defaults.clientOperationId;
    	      this.deletions = defaults.deletions;
    	      this.id = defaults.id;
    	      this.isServing = defaults.isServing;
    	      this.kind = defaults.kind;
    	      this.managedZone = defaults.managedZone;
    	      this.project = defaults.project;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
        }

        public Builder additions(@Nullable Input<List<ResourceRecordSetArgs>> additions) {
            this.additions = additions;
            return this;
        }

        public Builder additions(@Nullable List<ResourceRecordSetArgs> additions) {
            this.additions = Input.ofNullable(additions);
            return this;
        }

        public Builder clientOperationId(@Nullable Input<String> clientOperationId) {
            this.clientOperationId = clientOperationId;
            return this;
        }

        public Builder clientOperationId(@Nullable String clientOperationId) {
            this.clientOperationId = Input.ofNullable(clientOperationId);
            return this;
        }

        public Builder deletions(@Nullable Input<List<ResourceRecordSetArgs>> deletions) {
            this.deletions = deletions;
            return this;
        }

        public Builder deletions(@Nullable List<ResourceRecordSetArgs> deletions) {
            this.deletions = Input.ofNullable(deletions);
            return this;
        }

        public Builder id(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder isServing(@Nullable Input<Boolean> isServing) {
            this.isServing = isServing;
            return this;
        }

        public Builder isServing(@Nullable Boolean isServing) {
            this.isServing = Input.ofNullable(isServing);
            return this;
        }

        public Builder kind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder managedZone(Input<String> managedZone) {
            this.managedZone = Objects.requireNonNull(managedZone);
            return this;
        }

        public Builder managedZone(String managedZone) {
            this.managedZone = Input.of(Objects.requireNonNull(managedZone));
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder startTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder startTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }

        public Builder status(@Nullable Input<ChangeStatus> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable ChangeStatus status) {
            this.status = Input.ofNullable(status);
            return this;
        }
        public ChangeArgs build() {
            return new ChangeArgs(additions, clientOperationId, deletions, id, isServing, kind, managedZone, project, startTime, status);
        }
    }
}
