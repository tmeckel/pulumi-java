// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProxyEndpointState extends io.pulumi.resources.ResourceArgs {

    public static final ProxyEndpointState Empty = new ProxyEndpointState();

    /**
     * The Amazon Resource Name (ARN) for the proxy endpoint.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The identifier for the proxy endpoint. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * 
     */
    @Import(name="dbProxyEndpointName")
      private final @Nullable Output<String> dbProxyEndpointName;

    public Output<String> getDbProxyEndpointName() {
        return this.dbProxyEndpointName == null ? Codegen.empty() : this.dbProxyEndpointName;
    }

    /**
     * The name of the DB proxy associated with the DB proxy endpoint that you create.
     * 
     */
    @Import(name="dbProxyName")
      private final @Nullable Output<String> dbProxyName;

    public Output<String> getDbProxyName() {
        return this.dbProxyName == null ? Codegen.empty() : this.dbProxyName;
    }

    /**
     * The endpoint that you can use to connect to the proxy. You include the endpoint value in the connection string for a database client application.
     * 
     */
    @Import(name="endpoint")
      private final @Nullable Output<String> endpoint;

    public Output<String> getEndpoint() {
        return this.endpoint == null ? Codegen.empty() : this.endpoint;
    }

    /**
     * Indicates whether this endpoint is the default endpoint for the associated DB proxy.
     * 
     */
    @Import(name="isDefault")
      private final @Nullable Output<Boolean> isDefault;

    public Output<Boolean> getIsDefault() {
        return this.isDefault == null ? Codegen.empty() : this.isDefault;
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * Indicates whether the DB proxy endpoint can be used for read/write or read-only operations. The default is `READ_WRITE`. Valid values are `READ_WRITE` and `READ_ONLY`.
     * 
     */
    @Import(name="targetRole")
      private final @Nullable Output<String> targetRole;

    public Output<String> getTargetRole() {
        return this.targetRole == null ? Codegen.empty() : this.targetRole;
    }

    /**
     * The VPC ID of the DB proxy endpoint.
     * 
     */
    @Import(name="vpcId")
      private final @Nullable Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId == null ? Codegen.empty() : this.vpcId;
    }

    /**
     * One or more VPC security group IDs to associate with the new proxy.
     * 
     */
    @Import(name="vpcSecurityGroupIds")
      private final @Nullable Output<List<String>> vpcSecurityGroupIds;

    public Output<List<String>> getVpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds == null ? Codegen.empty() : this.vpcSecurityGroupIds;
    }

    /**
     * One or more VPC subnet IDs to associate with the new proxy.
     * 
     */
    @Import(name="vpcSubnetIds")
      private final @Nullable Output<List<String>> vpcSubnetIds;

    public Output<List<String>> getVpcSubnetIds() {
        return this.vpcSubnetIds == null ? Codegen.empty() : this.vpcSubnetIds;
    }

    public ProxyEndpointState(
        @Nullable Output<String> arn,
        @Nullable Output<String> dbProxyEndpointName,
        @Nullable Output<String> dbProxyName,
        @Nullable Output<String> endpoint,
        @Nullable Output<Boolean> isDefault,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> targetRole,
        @Nullable Output<String> vpcId,
        @Nullable Output<List<String>> vpcSecurityGroupIds,
        @Nullable Output<List<String>> vpcSubnetIds) {
        this.arn = arn;
        this.dbProxyEndpointName = dbProxyEndpointName;
        this.dbProxyName = dbProxyName;
        this.endpoint = endpoint;
        this.isDefault = isDefault;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.targetRole = targetRole;
        this.vpcId = vpcId;
        this.vpcSecurityGroupIds = vpcSecurityGroupIds;
        this.vpcSubnetIds = vpcSubnetIds;
    }

    private ProxyEndpointState() {
        this.arn = Codegen.empty();
        this.dbProxyEndpointName = Codegen.empty();
        this.dbProxyName = Codegen.empty();
        this.endpoint = Codegen.empty();
        this.isDefault = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.targetRole = Codegen.empty();
        this.vpcId = Codegen.empty();
        this.vpcSecurityGroupIds = Codegen.empty();
        this.vpcSubnetIds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProxyEndpointState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> dbProxyEndpointName;
        private @Nullable Output<String> dbProxyName;
        private @Nullable Output<String> endpoint;
        private @Nullable Output<Boolean> isDefault;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> targetRole;
        private @Nullable Output<String> vpcId;
        private @Nullable Output<List<String>> vpcSecurityGroupIds;
        private @Nullable Output<List<String>> vpcSubnetIds;

        public Builder() {
    	      // Empty
        }

        public Builder(ProxyEndpointState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.dbProxyEndpointName = defaults.dbProxyEndpointName;
    	      this.dbProxyName = defaults.dbProxyName;
    	      this.endpoint = defaults.endpoint;
    	      this.isDefault = defaults.isDefault;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.targetRole = defaults.targetRole;
    	      this.vpcId = defaults.vpcId;
    	      this.vpcSecurityGroupIds = defaults.vpcSecurityGroupIds;
    	      this.vpcSubnetIds = defaults.vpcSubnetIds;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder dbProxyEndpointName(@Nullable Output<String> dbProxyEndpointName) {
            this.dbProxyEndpointName = dbProxyEndpointName;
            return this;
        }
        public Builder dbProxyEndpointName(@Nullable String dbProxyEndpointName) {
            this.dbProxyEndpointName = Codegen.ofNullable(dbProxyEndpointName);
            return this;
        }
        public Builder dbProxyName(@Nullable Output<String> dbProxyName) {
            this.dbProxyName = dbProxyName;
            return this;
        }
        public Builder dbProxyName(@Nullable String dbProxyName) {
            this.dbProxyName = Codegen.ofNullable(dbProxyName);
            return this;
        }
        public Builder endpoint(@Nullable Output<String> endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = Codegen.ofNullable(endpoint);
            return this;
        }
        public Builder isDefault(@Nullable Output<Boolean> isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Builder isDefault(@Nullable Boolean isDefault) {
            this.isDefault = Codegen.ofNullable(isDefault);
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
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder targetRole(@Nullable Output<String> targetRole) {
            this.targetRole = targetRole;
            return this;
        }
        public Builder targetRole(@Nullable String targetRole) {
            this.targetRole = Codegen.ofNullable(targetRole);
            return this;
        }
        public Builder vpcId(@Nullable Output<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = Codegen.ofNullable(vpcId);
            return this;
        }
        public Builder vpcSecurityGroupIds(@Nullable Output<List<String>> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = vpcSecurityGroupIds;
            return this;
        }
        public Builder vpcSecurityGroupIds(@Nullable List<String> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = Codegen.ofNullable(vpcSecurityGroupIds);
            return this;
        }
        public Builder vpcSecurityGroupIds(String... vpcSecurityGroupIds) {
            return vpcSecurityGroupIds(List.of(vpcSecurityGroupIds));
        }
        public Builder vpcSubnetIds(@Nullable Output<List<String>> vpcSubnetIds) {
            this.vpcSubnetIds = vpcSubnetIds;
            return this;
        }
        public Builder vpcSubnetIds(@Nullable List<String> vpcSubnetIds) {
            this.vpcSubnetIds = Codegen.ofNullable(vpcSubnetIds);
            return this;
        }
        public Builder vpcSubnetIds(String... vpcSubnetIds) {
            return vpcSubnetIds(List.of(vpcSubnetIds));
        }        public ProxyEndpointState build() {
            return new ProxyEndpointState(arn, dbProxyEndpointName, dbProxyName, endpoint, isDefault, tags, tagsAll, targetRole, vpcId, vpcSecurityGroupIds, vpcSubnetIds);
        }
    }
}
