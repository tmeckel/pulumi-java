// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dms.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReplicationSubnetGroupState extends io.pulumi.resources.ResourceArgs {

    public static final ReplicationSubnetGroupState Empty = new ReplicationSubnetGroupState();

    @Import(name="replicationSubnetGroupArn")
      private final @Nullable Output<String> replicationSubnetGroupArn;

    public Output<String> getReplicationSubnetGroupArn() {
        return this.replicationSubnetGroupArn == null ? Codegen.empty() : this.replicationSubnetGroupArn;
    }

    /**
     * The description for the subnet group.
     * 
     */
    @Import(name="replicationSubnetGroupDescription")
      private final @Nullable Output<String> replicationSubnetGroupDescription;

    public Output<String> getReplicationSubnetGroupDescription() {
        return this.replicationSubnetGroupDescription == null ? Codegen.empty() : this.replicationSubnetGroupDescription;
    }

    /**
     * The name for the replication subnet group. This value is stored as a lowercase string.
     * 
     */
    @Import(name="replicationSubnetGroupId")
      private final @Nullable Output<String> replicationSubnetGroupId;

    public Output<String> getReplicationSubnetGroupId() {
        return this.replicationSubnetGroupId == null ? Codegen.empty() : this.replicationSubnetGroupId;
    }

    /**
     * A list of the EC2 subnet IDs for the subnet group.
     * 
     */
    @Import(name="subnetIds")
      private final @Nullable Output<List<String>> subnetIds;

    public Output<List<String>> getSubnetIds() {
        return this.subnetIds == null ? Codegen.empty() : this.subnetIds;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * The ID of the VPC the subnet group is in.
     * 
     */
    @Import(name="vpcId")
      private final @Nullable Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId == null ? Codegen.empty() : this.vpcId;
    }

    public ReplicationSubnetGroupState(
        @Nullable Output<String> replicationSubnetGroupArn,
        @Nullable Output<String> replicationSubnetGroupDescription,
        @Nullable Output<String> replicationSubnetGroupId,
        @Nullable Output<List<String>> subnetIds,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> vpcId) {
        this.replicationSubnetGroupArn = replicationSubnetGroupArn;
        this.replicationSubnetGroupDescription = replicationSubnetGroupDescription;
        this.replicationSubnetGroupId = replicationSubnetGroupId;
        this.subnetIds = subnetIds;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.vpcId = vpcId;
    }

    private ReplicationSubnetGroupState() {
        this.replicationSubnetGroupArn = Codegen.empty();
        this.replicationSubnetGroupDescription = Codegen.empty();
        this.replicationSubnetGroupId = Codegen.empty();
        this.subnetIds = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.vpcId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationSubnetGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> replicationSubnetGroupArn;
        private @Nullable Output<String> replicationSubnetGroupDescription;
        private @Nullable Output<String> replicationSubnetGroupId;
        private @Nullable Output<List<String>> subnetIds;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationSubnetGroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicationSubnetGroupArn = defaults.replicationSubnetGroupArn;
    	      this.replicationSubnetGroupDescription = defaults.replicationSubnetGroupDescription;
    	      this.replicationSubnetGroupId = defaults.replicationSubnetGroupId;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder replicationSubnetGroupArn(@Nullable Output<String> replicationSubnetGroupArn) {
            this.replicationSubnetGroupArn = replicationSubnetGroupArn;
            return this;
        }
        public Builder replicationSubnetGroupArn(@Nullable String replicationSubnetGroupArn) {
            this.replicationSubnetGroupArn = Codegen.ofNullable(replicationSubnetGroupArn);
            return this;
        }
        public Builder replicationSubnetGroupDescription(@Nullable Output<String> replicationSubnetGroupDescription) {
            this.replicationSubnetGroupDescription = replicationSubnetGroupDescription;
            return this;
        }
        public Builder replicationSubnetGroupDescription(@Nullable String replicationSubnetGroupDescription) {
            this.replicationSubnetGroupDescription = Codegen.ofNullable(replicationSubnetGroupDescription);
            return this;
        }
        public Builder replicationSubnetGroupId(@Nullable Output<String> replicationSubnetGroupId) {
            this.replicationSubnetGroupId = replicationSubnetGroupId;
            return this;
        }
        public Builder replicationSubnetGroupId(@Nullable String replicationSubnetGroupId) {
            this.replicationSubnetGroupId = Codegen.ofNullable(replicationSubnetGroupId);
            return this;
        }
        public Builder subnetIds(@Nullable Output<List<String>> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }
        public Builder subnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = Codegen.ofNullable(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder vpcId(@Nullable Output<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = Codegen.ofNullable(vpcId);
            return this;
        }        public ReplicationSubnetGroupState build() {
            return new ReplicationSubnetGroupState(replicationSubnetGroupArn, replicationSubnetGroupDescription, replicationSubnetGroupId, subnetIds, tags, tagsAll, vpcId);
        }
    }
}
