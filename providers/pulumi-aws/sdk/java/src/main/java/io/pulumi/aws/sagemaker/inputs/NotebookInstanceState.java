// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NotebookInstanceState extends io.pulumi.resources.ResourceArgs {

    public static final NotebookInstanceState Empty = new NotebookInstanceState();

    /**
     * An array of up to three Git repositories to associate with the notebook instance.
     * These can be either the names of Git repositories stored as resources in your account, or the URL of Git repositories in [AWS CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any other Git repository. These repositories are cloned at the same level as the default repository of your notebook instance.
     * 
     */
    @InputImport(name="additionalCodeRepositories")
      private final @Nullable Input<List<String>> additionalCodeRepositories;

    public Input<List<String>> getAdditionalCodeRepositories() {
        return this.additionalCodeRepositories == null ? Input.empty() : this.additionalCodeRepositories;
    }

    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this notebook instance.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The Git repository associated with the notebook instance as its default code repository. This can be either the name of a Git repository stored as a resource in your account, or the URL of a Git repository in [AWS CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any other Git repository.
     * 
     */
    @InputImport(name="defaultCodeRepository")
      private final @Nullable Input<String> defaultCodeRepository;

    public Input<String> getDefaultCodeRepository() {
        return this.defaultCodeRepository == null ? Input.empty() : this.defaultCodeRepository;
    }

    /**
     * Set to `Disabled` to disable internet access to notebook. Requires `security_groups` and `subnet_id` to be set. Supported values: `Enabled` (Default) or `Disabled`. If set to `Disabled`, the notebook instance will be able to access resources only in your VPC, and will not be able to connect to Amazon SageMaker training and endpoint services unless your configure a NAT Gateway in your VPC.
     * 
     */
    @InputImport(name="directInternetAccess")
      private final @Nullable Input<String> directInternetAccess;

    public Input<String> getDirectInternetAccess() {
        return this.directInternetAccess == null ? Input.empty() : this.directInternetAccess;
    }

    /**
     * The name of ML compute instance type.
     * 
     */
    @InputImport(name="instanceType")
      private final @Nullable Input<String> instanceType;

    public Input<String> getInstanceType() {
        return this.instanceType == null ? Input.empty() : this.instanceType;
    }

    /**
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest using Amazon S3 server-side encryption.
     * 
     */
    @InputImport(name="kmsKeyId")
      private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    /**
     * The name of a lifecycle configuration to associate with the notebook instance.
     * 
     */
    @InputImport(name="lifecycleConfigName")
      private final @Nullable Input<String> lifecycleConfigName;

    public Input<String> getLifecycleConfigName() {
        return this.lifecycleConfigName == null ? Input.empty() : this.lifecycleConfigName;
    }

    /**
     * The name of the notebook instance (must be unique).
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The network interface ID that Amazon SageMaker created at the time of creating the instance. Only available when setting `subnet_id`.
     * 
     */
    @InputImport(name="networkInterfaceId")
      private final @Nullable Input<String> networkInterfaceId;

    public Input<String> getNetworkInterfaceId() {
        return this.networkInterfaceId == null ? Input.empty() : this.networkInterfaceId;
    }

    /**
     * The platform identifier of the notebook instance runtime environment. This value can be either `notebook-al1-v1` or `notebook-al2-v1`, depending on which version of Amazon Linux you require.
     * 
     */
    @InputImport(name="platformIdentifier")
      private final @Nullable Input<String> platformIdentifier;

    public Input<String> getPlatformIdentifier() {
        return this.platformIdentifier == null ? Input.empty() : this.platformIdentifier;
    }

    /**
     * The ARN of the IAM role to be used by the notebook instance which allows SageMaker to call other services on your behalf.
     * 
     */
    @InputImport(name="roleArn")
      private final @Nullable Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn == null ? Input.empty() : this.roleArn;
    }

    /**
     * Whether root access is `Enabled` or `Disabled` for users of the notebook instance. The default value is `Enabled`.
     * 
     */
    @InputImport(name="rootAccess")
      private final @Nullable Input<String> rootAccess;

    public Input<String> getRootAccess() {
        return this.rootAccess == null ? Input.empty() : this.rootAccess;
    }

    /**
     * The associated security groups.
     * 
     */
    @InputImport(name="securityGroups")
      private final @Nullable Input<List<String>> securityGroups;

    public Input<List<String>> getSecurityGroups() {
        return this.securityGroups == null ? Input.empty() : this.securityGroups;
    }

    /**
     * The VPC subnet ID.
     * 
     */
    @InputImport(name="subnetId")
      private final @Nullable Input<String> subnetId;

    public Input<String> getSubnetId() {
        return this.subnetId == null ? Input.empty() : this.subnetId;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * The URL that you use to connect to the Jupyter notebook that is running in your notebook instance.
     * 
     */
    @InputImport(name="url")
      private final @Nullable Input<String> url;

    public Input<String> getUrl() {
        return this.url == null ? Input.empty() : this.url;
    }

    /**
     * The size, in GB, of the ML storage volume to attach to the notebook instance. The default value is 5 GB.
     * 
     */
    @InputImport(name="volumeSize")
      private final @Nullable Input<Integer> volumeSize;

    public Input<Integer> getVolumeSize() {
        return this.volumeSize == null ? Input.empty() : this.volumeSize;
    }

    public NotebookInstanceState(
        @Nullable Input<List<String>> additionalCodeRepositories,
        @Nullable Input<String> arn,
        @Nullable Input<String> defaultCodeRepository,
        @Nullable Input<String> directInternetAccess,
        @Nullable Input<String> instanceType,
        @Nullable Input<String> kmsKeyId,
        @Nullable Input<String> lifecycleConfigName,
        @Nullable Input<String> name,
        @Nullable Input<String> networkInterfaceId,
        @Nullable Input<String> platformIdentifier,
        @Nullable Input<String> roleArn,
        @Nullable Input<String> rootAccess,
        @Nullable Input<List<String>> securityGroups,
        @Nullable Input<String> subnetId,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> url,
        @Nullable Input<Integer> volumeSize) {
        this.additionalCodeRepositories = additionalCodeRepositories;
        this.arn = arn;
        this.defaultCodeRepository = defaultCodeRepository;
        this.directInternetAccess = directInternetAccess;
        this.instanceType = instanceType;
        this.kmsKeyId = kmsKeyId;
        this.lifecycleConfigName = lifecycleConfigName;
        this.name = name;
        this.networkInterfaceId = networkInterfaceId;
        this.platformIdentifier = platformIdentifier;
        this.roleArn = roleArn;
        this.rootAccess = rootAccess;
        this.securityGroups = securityGroups;
        this.subnetId = subnetId;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.url = url;
        this.volumeSize = volumeSize;
    }

    private NotebookInstanceState() {
        this.additionalCodeRepositories = Input.empty();
        this.arn = Input.empty();
        this.defaultCodeRepository = Input.empty();
        this.directInternetAccess = Input.empty();
        this.instanceType = Input.empty();
        this.kmsKeyId = Input.empty();
        this.lifecycleConfigName = Input.empty();
        this.name = Input.empty();
        this.networkInterfaceId = Input.empty();
        this.platformIdentifier = Input.empty();
        this.roleArn = Input.empty();
        this.rootAccess = Input.empty();
        this.securityGroups = Input.empty();
        this.subnetId = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.url = Input.empty();
        this.volumeSize = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotebookInstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> additionalCodeRepositories;
        private @Nullable Input<String> arn;
        private @Nullable Input<String> defaultCodeRepository;
        private @Nullable Input<String> directInternetAccess;
        private @Nullable Input<String> instanceType;
        private @Nullable Input<String> kmsKeyId;
        private @Nullable Input<String> lifecycleConfigName;
        private @Nullable Input<String> name;
        private @Nullable Input<String> networkInterfaceId;
        private @Nullable Input<String> platformIdentifier;
        private @Nullable Input<String> roleArn;
        private @Nullable Input<String> rootAccess;
        private @Nullable Input<List<String>> securityGroups;
        private @Nullable Input<String> subnetId;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> url;
        private @Nullable Input<Integer> volumeSize;

        public Builder() {
    	      // Empty
        }

        public Builder(NotebookInstanceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalCodeRepositories = defaults.additionalCodeRepositories;
    	      this.arn = defaults.arn;
    	      this.defaultCodeRepository = defaults.defaultCodeRepository;
    	      this.directInternetAccess = defaults.directInternetAccess;
    	      this.instanceType = defaults.instanceType;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.lifecycleConfigName = defaults.lifecycleConfigName;
    	      this.name = defaults.name;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.platformIdentifier = defaults.platformIdentifier;
    	      this.roleArn = defaults.roleArn;
    	      this.rootAccess = defaults.rootAccess;
    	      this.securityGroups = defaults.securityGroups;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.url = defaults.url;
    	      this.volumeSize = defaults.volumeSize;
        }

        public Builder additionalCodeRepositories(@Nullable Input<List<String>> additionalCodeRepositories) {
            this.additionalCodeRepositories = additionalCodeRepositories;
            return this;
        }

        public Builder additionalCodeRepositories(@Nullable List<String> additionalCodeRepositories) {
            this.additionalCodeRepositories = Input.ofNullable(additionalCodeRepositories);
            return this;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder defaultCodeRepository(@Nullable Input<String> defaultCodeRepository) {
            this.defaultCodeRepository = defaultCodeRepository;
            return this;
        }

        public Builder defaultCodeRepository(@Nullable String defaultCodeRepository) {
            this.defaultCodeRepository = Input.ofNullable(defaultCodeRepository);
            return this;
        }

        public Builder directInternetAccess(@Nullable Input<String> directInternetAccess) {
            this.directInternetAccess = directInternetAccess;
            return this;
        }

        public Builder directInternetAccess(@Nullable String directInternetAccess) {
            this.directInternetAccess = Input.ofNullable(directInternetAccess);
            return this;
        }

        public Builder instanceType(@Nullable Input<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = Input.ofNullable(instanceType);
            return this;
        }

        public Builder kmsKeyId(@Nullable Input<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Input.ofNullable(kmsKeyId);
            return this;
        }

        public Builder lifecycleConfigName(@Nullable Input<String> lifecycleConfigName) {
            this.lifecycleConfigName = lifecycleConfigName;
            return this;
        }

        public Builder lifecycleConfigName(@Nullable String lifecycleConfigName) {
            this.lifecycleConfigName = Input.ofNullable(lifecycleConfigName);
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

        public Builder networkInterfaceId(@Nullable Input<String> networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        public Builder networkInterfaceId(@Nullable String networkInterfaceId) {
            this.networkInterfaceId = Input.ofNullable(networkInterfaceId);
            return this;
        }

        public Builder platformIdentifier(@Nullable Input<String> platformIdentifier) {
            this.platformIdentifier = platformIdentifier;
            return this;
        }

        public Builder platformIdentifier(@Nullable String platformIdentifier) {
            this.platformIdentifier = Input.ofNullable(platformIdentifier);
            return this;
        }

        public Builder roleArn(@Nullable Input<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = Input.ofNullable(roleArn);
            return this;
        }

        public Builder rootAccess(@Nullable Input<String> rootAccess) {
            this.rootAccess = rootAccess;
            return this;
        }

        public Builder rootAccess(@Nullable String rootAccess) {
            this.rootAccess = Input.ofNullable(rootAccess);
            return this;
        }

        public Builder securityGroups(@Nullable Input<List<String>> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        public Builder securityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = Input.ofNullable(securityGroups);
            return this;
        }

        public Builder subnetId(@Nullable Input<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = Input.ofNullable(subnetId);
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

        public Builder tagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder url(@Nullable Input<String> url) {
            this.url = url;
            return this;
        }

        public Builder url(@Nullable String url) {
            this.url = Input.ofNullable(url);
            return this;
        }

        public Builder volumeSize(@Nullable Input<Integer> volumeSize) {
            this.volumeSize = volumeSize;
            return this;
        }

        public Builder volumeSize(@Nullable Integer volumeSize) {
            this.volumeSize = Input.ofNullable(volumeSize);
            return this;
        }
        public NotebookInstanceState build() {
            return new NotebookInstanceState(additionalCodeRepositories, arn, defaultCodeRepository, directInternetAccess, instanceType, kmsKeyId, lifecycleConfigName, name, networkInterfaceId, platformIdentifier, roleArn, rootAccess, securityGroups, subnetId, tags, tagsAll, url, volumeSize);
        }
    }
}
