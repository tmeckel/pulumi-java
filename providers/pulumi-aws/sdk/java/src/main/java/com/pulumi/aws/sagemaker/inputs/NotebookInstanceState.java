// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotebookInstanceState extends com.pulumi.resources.ResourceArgs {

    public static final NotebookInstanceState Empty = new NotebookInstanceState();

    /**
     * An array of up to three Git repositories to associate with the notebook instance.
     * These can be either the names of Git repositories stored as resources in your account, or the URL of Git repositories in [AWS CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any other Git repository. These repositories are cloned at the same level as the default repository of your notebook instance.
     * 
     */
    @Import(name="additionalCodeRepositories")
    private @Nullable Output<List<String>> additionalCodeRepositories;

    /**
     * @return An array of up to three Git repositories to associate with the notebook instance.
     * These can be either the names of Git repositories stored as resources in your account, or the URL of Git repositories in [AWS CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any other Git repository. These repositories are cloned at the same level as the default repository of your notebook instance.
     * 
     */
    public Optional<Output<List<String>>> additionalCodeRepositories() {
        return Optional.ofNullable(this.additionalCodeRepositories);
    }

    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this notebook instance.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) assigned by AWS to this notebook instance.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The Git repository associated with the notebook instance as its default code repository. This can be either the name of a Git repository stored as a resource in your account, or the URL of a Git repository in [AWS CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any other Git repository.
     * 
     */
    @Import(name="defaultCodeRepository")
    private @Nullable Output<String> defaultCodeRepository;

    /**
     * @return The Git repository associated with the notebook instance as its default code repository. This can be either the name of a Git repository stored as a resource in your account, or the URL of a Git repository in [AWS CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any other Git repository.
     * 
     */
    public Optional<Output<String>> defaultCodeRepository() {
        return Optional.ofNullable(this.defaultCodeRepository);
    }

    /**
     * Set to `Disabled` to disable internet access to notebook. Requires `security_groups` and `subnet_id` to be set. Supported values: `Enabled` (Default) or `Disabled`. If set to `Disabled`, the notebook instance will be able to access resources only in your VPC, and will not be able to connect to Amazon SageMaker training and endpoint services unless your configure a NAT Gateway in your VPC.
     * 
     */
    @Import(name="directInternetAccess")
    private @Nullable Output<String> directInternetAccess;

    /**
     * @return Set to `Disabled` to disable internet access to notebook. Requires `security_groups` and `subnet_id` to be set. Supported values: `Enabled` (Default) or `Disabled`. If set to `Disabled`, the notebook instance will be able to access resources only in your VPC, and will not be able to connect to Amazon SageMaker training and endpoint services unless your configure a NAT Gateway in your VPC.
     * 
     */
    public Optional<Output<String>> directInternetAccess() {
        return Optional.ofNullable(this.directInternetAccess);
    }

    /**
     * The name of ML compute instance type.
     * 
     */
    @Import(name="instanceType")
    private @Nullable Output<String> instanceType;

    /**
     * @return The name of ML compute instance type.
     * 
     */
    public Optional<Output<String>> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    /**
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest using Amazon S3 server-side encryption.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    /**
     * @return The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest using Amazon S3 server-side encryption.
     * 
     */
    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * The name of a lifecycle configuration to associate with the notebook instance.
     * 
     */
    @Import(name="lifecycleConfigName")
    private @Nullable Output<String> lifecycleConfigName;

    /**
     * @return The name of a lifecycle configuration to associate with the notebook instance.
     * 
     */
    public Optional<Output<String>> lifecycleConfigName() {
        return Optional.ofNullable(this.lifecycleConfigName);
    }

    /**
     * The name of the notebook instance (must be unique).
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the notebook instance (must be unique).
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The network interface ID that Amazon SageMaker created at the time of creating the instance. Only available when setting `subnet_id`.
     * 
     */
    @Import(name="networkInterfaceId")
    private @Nullable Output<String> networkInterfaceId;

    /**
     * @return The network interface ID that Amazon SageMaker created at the time of creating the instance. Only available when setting `subnet_id`.
     * 
     */
    public Optional<Output<String>> networkInterfaceId() {
        return Optional.ofNullable(this.networkInterfaceId);
    }

    /**
     * The platform identifier of the notebook instance runtime environment. This value can be either `notebook-al1-v1` or `notebook-al2-v1`, depending on which version of Amazon Linux you require.
     * 
     */
    @Import(name="platformIdentifier")
    private @Nullable Output<String> platformIdentifier;

    /**
     * @return The platform identifier of the notebook instance runtime environment. This value can be either `notebook-al1-v1` or `notebook-al2-v1`, depending on which version of Amazon Linux you require.
     * 
     */
    public Optional<Output<String>> platformIdentifier() {
        return Optional.ofNullable(this.platformIdentifier);
    }

    /**
     * The ARN of the IAM role to be used by the notebook instance which allows SageMaker to call other services on your behalf.
     * 
     */
    @Import(name="roleArn")
    private @Nullable Output<String> roleArn;

    /**
     * @return The ARN of the IAM role to be used by the notebook instance which allows SageMaker to call other services on your behalf.
     * 
     */
    public Optional<Output<String>> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    /**
     * Whether root access is `Enabled` or `Disabled` for users of the notebook instance. The default value is `Enabled`.
     * 
     */
    @Import(name="rootAccess")
    private @Nullable Output<String> rootAccess;

    /**
     * @return Whether root access is `Enabled` or `Disabled` for users of the notebook instance. The default value is `Enabled`.
     * 
     */
    public Optional<Output<String>> rootAccess() {
        return Optional.ofNullable(this.rootAccess);
    }

    /**
     * The associated security groups.
     * 
     */
    @Import(name="securityGroups")
    private @Nullable Output<List<String>> securityGroups;

    /**
     * @return The associated security groups.
     * 
     */
    public Optional<Output<List<String>>> securityGroups() {
        return Optional.ofNullable(this.securityGroups);
    }

    /**
     * The VPC subnet ID.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return The VPC subnet ID.
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * The URL that you use to connect to the Jupyter notebook that is running in your notebook instance.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return The URL that you use to connect to the Jupyter notebook that is running in your notebook instance.
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    /**
     * The size, in GB, of the ML storage volume to attach to the notebook instance. The default value is 5 GB.
     * 
     */
    @Import(name="volumeSize")
    private @Nullable Output<Integer> volumeSize;

    /**
     * @return The size, in GB, of the ML storage volume to attach to the notebook instance. The default value is 5 GB.
     * 
     */
    public Optional<Output<Integer>> volumeSize() {
        return Optional.ofNullable(this.volumeSize);
    }

    private NotebookInstanceState() {}

    private NotebookInstanceState(NotebookInstanceState $) {
        this.additionalCodeRepositories = $.additionalCodeRepositories;
        this.arn = $.arn;
        this.defaultCodeRepository = $.defaultCodeRepository;
        this.directInternetAccess = $.directInternetAccess;
        this.instanceType = $.instanceType;
        this.kmsKeyId = $.kmsKeyId;
        this.lifecycleConfigName = $.lifecycleConfigName;
        this.name = $.name;
        this.networkInterfaceId = $.networkInterfaceId;
        this.platformIdentifier = $.platformIdentifier;
        this.roleArn = $.roleArn;
        this.rootAccess = $.rootAccess;
        this.securityGroups = $.securityGroups;
        this.subnetId = $.subnetId;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.url = $.url;
        this.volumeSize = $.volumeSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotebookInstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotebookInstanceState $;

        public Builder() {
            $ = new NotebookInstanceState();
        }

        public Builder(NotebookInstanceState defaults) {
            $ = new NotebookInstanceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalCodeRepositories An array of up to three Git repositories to associate with the notebook instance.
         * These can be either the names of Git repositories stored as resources in your account, or the URL of Git repositories in [AWS CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any other Git repository. These repositories are cloned at the same level as the default repository of your notebook instance.
         * 
         * @return builder
         * 
         */
        public Builder additionalCodeRepositories(@Nullable Output<List<String>> additionalCodeRepositories) {
            $.additionalCodeRepositories = additionalCodeRepositories;
            return this;
        }

        /**
         * @param additionalCodeRepositories An array of up to three Git repositories to associate with the notebook instance.
         * These can be either the names of Git repositories stored as resources in your account, or the URL of Git repositories in [AWS CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any other Git repository. These repositories are cloned at the same level as the default repository of your notebook instance.
         * 
         * @return builder
         * 
         */
        public Builder additionalCodeRepositories(List<String> additionalCodeRepositories) {
            return additionalCodeRepositories(Output.of(additionalCodeRepositories));
        }

        /**
         * @param additionalCodeRepositories An array of up to three Git repositories to associate with the notebook instance.
         * These can be either the names of Git repositories stored as resources in your account, or the URL of Git repositories in [AWS CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any other Git repository. These repositories are cloned at the same level as the default repository of your notebook instance.
         * 
         * @return builder
         * 
         */
        public Builder additionalCodeRepositories(String... additionalCodeRepositories) {
            return additionalCodeRepositories(List.of(additionalCodeRepositories));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) assigned by AWS to this notebook instance.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) assigned by AWS to this notebook instance.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param defaultCodeRepository The Git repository associated with the notebook instance as its default code repository. This can be either the name of a Git repository stored as a resource in your account, or the URL of a Git repository in [AWS CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any other Git repository.
         * 
         * @return builder
         * 
         */
        public Builder defaultCodeRepository(@Nullable Output<String> defaultCodeRepository) {
            $.defaultCodeRepository = defaultCodeRepository;
            return this;
        }

        /**
         * @param defaultCodeRepository The Git repository associated with the notebook instance as its default code repository. This can be either the name of a Git repository stored as a resource in your account, or the URL of a Git repository in [AWS CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any other Git repository.
         * 
         * @return builder
         * 
         */
        public Builder defaultCodeRepository(String defaultCodeRepository) {
            return defaultCodeRepository(Output.of(defaultCodeRepository));
        }

        /**
         * @param directInternetAccess Set to `Disabled` to disable internet access to notebook. Requires `security_groups` and `subnet_id` to be set. Supported values: `Enabled` (Default) or `Disabled`. If set to `Disabled`, the notebook instance will be able to access resources only in your VPC, and will not be able to connect to Amazon SageMaker training and endpoint services unless your configure a NAT Gateway in your VPC.
         * 
         * @return builder
         * 
         */
        public Builder directInternetAccess(@Nullable Output<String> directInternetAccess) {
            $.directInternetAccess = directInternetAccess;
            return this;
        }

        /**
         * @param directInternetAccess Set to `Disabled` to disable internet access to notebook. Requires `security_groups` and `subnet_id` to be set. Supported values: `Enabled` (Default) or `Disabled`. If set to `Disabled`, the notebook instance will be able to access resources only in your VPC, and will not be able to connect to Amazon SageMaker training and endpoint services unless your configure a NAT Gateway in your VPC.
         * 
         * @return builder
         * 
         */
        public Builder directInternetAccess(String directInternetAccess) {
            return directInternetAccess(Output.of(directInternetAccess));
        }

        /**
         * @param instanceType The name of ML compute instance type.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(@Nullable Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param instanceType The name of ML compute instance type.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        /**
         * @param kmsKeyId The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest using Amazon S3 server-side encryption.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param kmsKeyId The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest using Amazon S3 server-side encryption.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        /**
         * @param lifecycleConfigName The name of a lifecycle configuration to associate with the notebook instance.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleConfigName(@Nullable Output<String> lifecycleConfigName) {
            $.lifecycleConfigName = lifecycleConfigName;
            return this;
        }

        /**
         * @param lifecycleConfigName The name of a lifecycle configuration to associate with the notebook instance.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleConfigName(String lifecycleConfigName) {
            return lifecycleConfigName(Output.of(lifecycleConfigName));
        }

        /**
         * @param name The name of the notebook instance (must be unique).
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the notebook instance (must be unique).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkInterfaceId The network interface ID that Amazon SageMaker created at the time of creating the instance. Only available when setting `subnet_id`.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaceId(@Nullable Output<String> networkInterfaceId) {
            $.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * @param networkInterfaceId The network interface ID that Amazon SageMaker created at the time of creating the instance. Only available when setting `subnet_id`.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            return networkInterfaceId(Output.of(networkInterfaceId));
        }

        /**
         * @param platformIdentifier The platform identifier of the notebook instance runtime environment. This value can be either `notebook-al1-v1` or `notebook-al2-v1`, depending on which version of Amazon Linux you require.
         * 
         * @return builder
         * 
         */
        public Builder platformIdentifier(@Nullable Output<String> platformIdentifier) {
            $.platformIdentifier = platformIdentifier;
            return this;
        }

        /**
         * @param platformIdentifier The platform identifier of the notebook instance runtime environment. This value can be either `notebook-al1-v1` or `notebook-al2-v1`, depending on which version of Amazon Linux you require.
         * 
         * @return builder
         * 
         */
        public Builder platformIdentifier(String platformIdentifier) {
            return platformIdentifier(Output.of(platformIdentifier));
        }

        /**
         * @param roleArn The ARN of the IAM role to be used by the notebook instance which allows SageMaker to call other services on your behalf.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(@Nullable Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn The ARN of the IAM role to be used by the notebook instance which allows SageMaker to call other services on your behalf.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param rootAccess Whether root access is `Enabled` or `Disabled` for users of the notebook instance. The default value is `Enabled`.
         * 
         * @return builder
         * 
         */
        public Builder rootAccess(@Nullable Output<String> rootAccess) {
            $.rootAccess = rootAccess;
            return this;
        }

        /**
         * @param rootAccess Whether root access is `Enabled` or `Disabled` for users of the notebook instance. The default value is `Enabled`.
         * 
         * @return builder
         * 
         */
        public Builder rootAccess(String rootAccess) {
            return rootAccess(Output.of(rootAccess));
        }

        /**
         * @param securityGroups The associated security groups.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            $.securityGroups = securityGroups;
            return this;
        }

        /**
         * @param securityGroups The associated security groups.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(List<String> securityGroups) {
            return securityGroups(Output.of(securityGroups));
        }

        /**
         * @param securityGroups The associated security groups.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }

        /**
         * @param subnetId The VPC subnet ID.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The VPC subnet ID.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param url The URL that you use to connect to the Jupyter notebook that is running in your notebook instance.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The URL that you use to connect to the Jupyter notebook that is running in your notebook instance.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        /**
         * @param volumeSize The size, in GB, of the ML storage volume to attach to the notebook instance. The default value is 5 GB.
         * 
         * @return builder
         * 
         */
        public Builder volumeSize(@Nullable Output<Integer> volumeSize) {
            $.volumeSize = volumeSize;
            return this;
        }

        /**
         * @param volumeSize The size, in GB, of the ML storage volume to attach to the notebook instance. The default value is 5 GB.
         * 
         * @return builder
         * 
         */
        public Builder volumeSize(Integer volumeSize) {
            return volumeSize(Output.of(volumeSize));
        }

        public NotebookInstanceState build() {
            return $;
        }
    }

}
