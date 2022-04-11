// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.ec2.inputs.SecurityGroupEgressArgs;
import io.pulumi.aws.ec2.inputs.SecurityGroupIngressArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityGroupArgs Empty = new SecurityGroupArgs();

    /**
     * Description of this egress rule.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Configuration block for egress rules. Can be specified multiple times for each egress rule. Each egress block supports fields documented below.
     * 
     */
    @Import(name="egress")
      private final @Nullable Output<List<SecurityGroupEgressArgs>> egress;

    public Output<List<SecurityGroupEgressArgs>> getEgress() {
        return this.egress == null ? Codegen.empty() : this.egress;
    }

    /**
     * Configuration block for egress rules. Can be specified multiple times for each ingress rule. Each ingress block supports fields documented below.
     * 
     */
    @Import(name="ingress")
      private final @Nullable Output<List<SecurityGroupIngressArgs>> ingress;

    public Output<List<SecurityGroupIngressArgs>> getIngress() {
        return this.ingress == null ? Codegen.empty() : this.ingress;
    }

    /**
     * Name of the security group. If omitted, this provider will assign a random, unique name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
      private final @Nullable Output<String> namePrefix;

    public Output<String> getNamePrefix() {
        return this.namePrefix == null ? Codegen.empty() : this.namePrefix;
    }

    /**
     * Instruct this provider to revoke all of the Security Groups attached ingress and egress rules before deleting the rule itself. This is normally not needed, however certain AWS services such as Elastic Map Reduce may automatically add required rules to security groups used with the service, and those rules may contain a cyclic dependency that prevent the security groups from being destroyed without removing the dependency first. Default `false`.
     * 
     */
    @Import(name="revokeRulesOnDelete")
      private final @Nullable Output<Boolean> revokeRulesOnDelete;

    public Output<Boolean> getRevokeRulesOnDelete() {
        return this.revokeRulesOnDelete == null ? Codegen.empty() : this.revokeRulesOnDelete;
    }

    /**
     * Map of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * VPC ID.
     * 
     */
    @Import(name="vpcId")
      private final @Nullable Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId == null ? Codegen.empty() : this.vpcId;
    }

    public SecurityGroupArgs(
        @Nullable Output<String> description,
        @Nullable Output<List<SecurityGroupEgressArgs>> egress,
        @Nullable Output<List<SecurityGroupIngressArgs>> ingress,
        @Nullable Output<String> name,
        @Nullable Output<String> namePrefix,
        @Nullable Output<Boolean> revokeRulesOnDelete,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> vpcId) {
        this.description = description == null ? Codegen.ofNullable("Managed by Pulumi") : description;
        this.egress = egress;
        this.ingress = ingress;
        this.name = name;
        this.namePrefix = namePrefix;
        this.revokeRulesOnDelete = revokeRulesOnDelete;
        this.tags = tags;
        this.vpcId = vpcId;
    }

    private SecurityGroupArgs() {
        this.description = Codegen.empty();
        this.egress = Codegen.empty();
        this.ingress = Codegen.empty();
        this.name = Codegen.empty();
        this.namePrefix = Codegen.empty();
        this.revokeRulesOnDelete = Codegen.empty();
        this.tags = Codegen.empty();
        this.vpcId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<List<SecurityGroupEgressArgs>> egress;
        private @Nullable Output<List<SecurityGroupIngressArgs>> ingress;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namePrefix;
        private @Nullable Output<Boolean> revokeRulesOnDelete;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.egress = defaults.egress;
    	      this.ingress = defaults.ingress;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.revokeRulesOnDelete = defaults.revokeRulesOnDelete;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder egress(@Nullable Output<List<SecurityGroupEgressArgs>> egress) {
            this.egress = egress;
            return this;
        }
        public Builder egress(@Nullable List<SecurityGroupEgressArgs> egress) {
            this.egress = Codegen.ofNullable(egress);
            return this;
        }
        public Builder egress(SecurityGroupEgressArgs... egress) {
            return egress(List.of(egress));
        }
        public Builder ingress(@Nullable Output<List<SecurityGroupIngressArgs>> ingress) {
            this.ingress = ingress;
            return this;
        }
        public Builder ingress(@Nullable List<SecurityGroupIngressArgs> ingress) {
            this.ingress = Codegen.ofNullable(ingress);
            return this;
        }
        public Builder ingress(SecurityGroupIngressArgs... ingress) {
            return ingress(List.of(ingress));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }
        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Codegen.ofNullable(namePrefix);
            return this;
        }
        public Builder revokeRulesOnDelete(@Nullable Output<Boolean> revokeRulesOnDelete) {
            this.revokeRulesOnDelete = revokeRulesOnDelete;
            return this;
        }
        public Builder revokeRulesOnDelete(@Nullable Boolean revokeRulesOnDelete) {
            this.revokeRulesOnDelete = Codegen.ofNullable(revokeRulesOnDelete);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder vpcId(@Nullable Output<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = Codegen.ofNullable(vpcId);
            return this;
        }        public SecurityGroupArgs build() {
            return new SecurityGroupArgs(description, egress, ingress, name, namePrefix, revokeRulesOnDelete, tags, vpcId);
        }
    }
}
