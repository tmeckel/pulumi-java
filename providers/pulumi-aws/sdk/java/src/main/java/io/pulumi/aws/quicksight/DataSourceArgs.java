// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight;

import io.pulumi.aws.quicksight.inputs.DataSourceCredentialsArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceParametersArgs;
import io.pulumi.aws.quicksight.inputs.DataSourcePermissionArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceSslPropertiesArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceVpcConnectionPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceArgs Empty = new DataSourceArgs();

    /**
     * The ID for the AWS account that the data source is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
     * 
     */
    @InputImport(name="awsAccountId")
      private final @Nullable Input<String> awsAccountId;

    public Input<String> getAwsAccountId() {
        return this.awsAccountId == null ? Input.empty() : this.awsAccountId;
    }

    /**
     * The credentials Amazon QuickSight uses to connect to your underlying source. Currently, only credentials based on user name and password are supported. See Credentials below for more details.
     * 
     */
    @InputImport(name="credentials")
      private final @Nullable Input<DataSourceCredentialsArgs> credentials;

    public Input<DataSourceCredentialsArgs> getCredentials() {
        return this.credentials == null ? Input.empty() : this.credentials;
    }

    /**
     * An identifier for the data source.
     * 
     */
    @InputImport(name="dataSourceId", required=true)
      private final Input<String> dataSourceId;

    public Input<String> getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * A name for the data source, maximum of 128 characters.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The parameters used to connect to this data source (exactly one).
     * 
     */
    @InputImport(name="parameters", required=true)
      private final Input<DataSourceParametersArgs> parameters;

    public Input<DataSourceParametersArgs> getParameters() {
        return this.parameters;
    }

    /**
     * A set of resource permissions on the data source. Maximum of 64 items. See Permission below for more details.
     * 
     */
    @InputImport(name="permissions")
      private final @Nullable Input<List<DataSourcePermissionArgs>> permissions;

    public Input<List<DataSourcePermissionArgs>> getPermissions() {
        return this.permissions == null ? Input.empty() : this.permissions;
    }

    /**
     * Secure Socket Layer (SSL) properties that apply when Amazon QuickSight connects to your underlying source. See SSL Properties below for more details.
     * 
     */
    @InputImport(name="sslProperties")
      private final @Nullable Input<DataSourceSslPropertiesArgs> sslProperties;

    public Input<DataSourceSslPropertiesArgs> getSslProperties() {
        return this.sslProperties == null ? Input.empty() : this.sslProperties;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The type of the data source. See the [AWS Documentation](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_CreateDataSource.html#QS-CreateDataSource-request-Type) for the complete list of valid values.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * Use this parameter only when you want Amazon QuickSight to use a VPC connection when connecting to your underlying source. See VPC Connection Properties below for more details.
     * 
     */
    @InputImport(name="vpcConnectionProperties")
      private final @Nullable Input<DataSourceVpcConnectionPropertiesArgs> vpcConnectionProperties;

    public Input<DataSourceVpcConnectionPropertiesArgs> getVpcConnectionProperties() {
        return this.vpcConnectionProperties == null ? Input.empty() : this.vpcConnectionProperties;
    }

    public DataSourceArgs(
        @Nullable Input<String> awsAccountId,
        @Nullable Input<DataSourceCredentialsArgs> credentials,
        Input<String> dataSourceId,
        @Nullable Input<String> name,
        Input<DataSourceParametersArgs> parameters,
        @Nullable Input<List<DataSourcePermissionArgs>> permissions,
        @Nullable Input<DataSourceSslPropertiesArgs> sslProperties,
        @Nullable Input<Map<String,String>> tags,
        Input<String> type,
        @Nullable Input<DataSourceVpcConnectionPropertiesArgs> vpcConnectionProperties) {
        this.awsAccountId = awsAccountId;
        this.credentials = credentials;
        this.dataSourceId = Objects.requireNonNull(dataSourceId, "expected parameter 'dataSourceId' to be non-null");
        this.name = name;
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
        this.permissions = permissions;
        this.sslProperties = sslProperties;
        this.tags = tags;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.vpcConnectionProperties = vpcConnectionProperties;
    }

    private DataSourceArgs() {
        this.awsAccountId = Input.empty();
        this.credentials = Input.empty();
        this.dataSourceId = Input.empty();
        this.name = Input.empty();
        this.parameters = Input.empty();
        this.permissions = Input.empty();
        this.sslProperties = Input.empty();
        this.tags = Input.empty();
        this.type = Input.empty();
        this.vpcConnectionProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> awsAccountId;
        private @Nullable Input<DataSourceCredentialsArgs> credentials;
        private Input<String> dataSourceId;
        private @Nullable Input<String> name;
        private Input<DataSourceParametersArgs> parameters;
        private @Nullable Input<List<DataSourcePermissionArgs>> permissions;
        private @Nullable Input<DataSourceSslPropertiesArgs> sslProperties;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> type;
        private @Nullable Input<DataSourceVpcConnectionPropertiesArgs> vpcConnectionProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccountId = defaults.awsAccountId;
    	      this.credentials = defaults.credentials;
    	      this.dataSourceId = defaults.dataSourceId;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.permissions = defaults.permissions;
    	      this.sslProperties = defaults.sslProperties;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.vpcConnectionProperties = defaults.vpcConnectionProperties;
        }

        public Builder awsAccountId(@Nullable Input<String> awsAccountId) {
            this.awsAccountId = awsAccountId;
            return this;
        }

        public Builder awsAccountId(@Nullable String awsAccountId) {
            this.awsAccountId = Input.ofNullable(awsAccountId);
            return this;
        }

        public Builder credentials(@Nullable Input<DataSourceCredentialsArgs> credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder credentials(@Nullable DataSourceCredentialsArgs credentials) {
            this.credentials = Input.ofNullable(credentials);
            return this;
        }

        public Builder dataSourceId(Input<String> dataSourceId) {
            this.dataSourceId = Objects.requireNonNull(dataSourceId);
            return this;
        }

        public Builder dataSourceId(String dataSourceId) {
            this.dataSourceId = Input.of(Objects.requireNonNull(dataSourceId));
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder parameters(Input<DataSourceParametersArgs> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder parameters(DataSourceParametersArgs parameters) {
            this.parameters = Input.of(Objects.requireNonNull(parameters));
            return this;
        }

        public Builder permissions(@Nullable Input<List<DataSourcePermissionArgs>> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder permissions(@Nullable List<DataSourcePermissionArgs> permissions) {
            this.permissions = Input.ofNullable(permissions);
            return this;
        }

        public Builder sslProperties(@Nullable Input<DataSourceSslPropertiesArgs> sslProperties) {
            this.sslProperties = sslProperties;
            return this;
        }

        public Builder sslProperties(@Nullable DataSourceSslPropertiesArgs sslProperties) {
            this.sslProperties = Input.ofNullable(sslProperties);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder vpcConnectionProperties(@Nullable Input<DataSourceVpcConnectionPropertiesArgs> vpcConnectionProperties) {
            this.vpcConnectionProperties = vpcConnectionProperties;
            return this;
        }

        public Builder vpcConnectionProperties(@Nullable DataSourceVpcConnectionPropertiesArgs vpcConnectionProperties) {
            this.vpcConnectionProperties = Input.ofNullable(vpcConnectionProperties);
            return this;
        }
        public DataSourceArgs build() {
            return new DataSourceArgs(awsAccountId, credentials, dataSourceId, name, parameters, permissions, sslProperties, tags, type, vpcConnectionProperties);
        }
    }
}
