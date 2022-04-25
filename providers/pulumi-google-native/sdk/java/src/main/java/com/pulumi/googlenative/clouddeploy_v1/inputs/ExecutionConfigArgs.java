// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.clouddeploy_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.clouddeploy_v1.enums.ExecutionConfigUsagesItem;
import com.pulumi.googlenative.clouddeploy_v1.inputs.DefaultPoolArgs;
import com.pulumi.googlenative.clouddeploy_v1.inputs.PrivatePoolArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration of the environment to use when calling Skaffold.
 * 
 */
public final class ExecutionConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExecutionConfigArgs Empty = new ExecutionConfigArgs();

    /**
     * Optional. Cloud Storage location where execution outputs should be stored. This can either be a bucket (&#34;gs://my-bucket&#34;) or a path within a bucket (&#34;gs://my-bucket/my-dir&#34;). If unspecified, a default bucket located in the same region will be used.
     * 
     */
    @Import(name="artifactStorage")
    private @Nullable Output<String> artifactStorage;

    /**
     * @return Optional. Cloud Storage location where execution outputs should be stored. This can either be a bucket (&#34;gs://my-bucket&#34;) or a path within a bucket (&#34;gs://my-bucket/my-dir&#34;). If unspecified, a default bucket located in the same region will be used.
     * 
     */
    public Optional<Output<String>> artifactStorage() {
        return Optional.ofNullable(this.artifactStorage);
    }

    /**
     * Optional. Use default Cloud Build pool.
     * 
     */
    @Import(name="defaultPool")
    private @Nullable Output<DefaultPoolArgs> defaultPool;

    /**
     * @return Optional. Use default Cloud Build pool.
     * 
     */
    public Optional<Output<DefaultPoolArgs>> defaultPool() {
        return Optional.ofNullable(this.defaultPool);
    }

    /**
     * Optional. Use private Cloud Build pool.
     * 
     */
    @Import(name="privatePool")
    private @Nullable Output<PrivatePoolArgs> privatePool;

    /**
     * @return Optional. Use private Cloud Build pool.
     * 
     */
    public Optional<Output<PrivatePoolArgs>> privatePool() {
        return Optional.ofNullable(this.privatePool);
    }

    /**
     * Optional. Google service account to use for execution. If unspecified, the project execution service account (-compute@developer.gserviceaccount.com) will be used.
     * 
     */
    @Import(name="serviceAccount")
    private @Nullable Output<String> serviceAccount;

    /**
     * @return Optional. Google service account to use for execution. If unspecified, the project execution service account (-compute@developer.gserviceaccount.com) will be used.
     * 
     */
    public Optional<Output<String>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    /**
     * Usages when this configuration should be applied.
     * 
     */
    @Import(name="usages", required=true)
    private Output<List<ExecutionConfigUsagesItem>> usages;

    /**
     * @return Usages when this configuration should be applied.
     * 
     */
    public Output<List<ExecutionConfigUsagesItem>> usages() {
        return this.usages;
    }

    /**
     * Optional. The resource name of the `WorkerPool`, with the format `projects/{project}/locations/{location}/workerPools/{worker_pool}`. If this optional field is unspecified, the default Cloud Build pool will be used.
     * 
     */
    @Import(name="workerPool")
    private @Nullable Output<String> workerPool;

    /**
     * @return Optional. The resource name of the `WorkerPool`, with the format `projects/{project}/locations/{location}/workerPools/{worker_pool}`. If this optional field is unspecified, the default Cloud Build pool will be used.
     * 
     */
    public Optional<Output<String>> workerPool() {
        return Optional.ofNullable(this.workerPool);
    }

    private ExecutionConfigArgs() {}

    private ExecutionConfigArgs(ExecutionConfigArgs $) {
        this.artifactStorage = $.artifactStorage;
        this.defaultPool = $.defaultPool;
        this.privatePool = $.privatePool;
        this.serviceAccount = $.serviceAccount;
        this.usages = $.usages;
        this.workerPool = $.workerPool;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExecutionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExecutionConfigArgs $;

        public Builder() {
            $ = new ExecutionConfigArgs();
        }

        public Builder(ExecutionConfigArgs defaults) {
            $ = new ExecutionConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param artifactStorage Optional. Cloud Storage location where execution outputs should be stored. This can either be a bucket (&#34;gs://my-bucket&#34;) or a path within a bucket (&#34;gs://my-bucket/my-dir&#34;). If unspecified, a default bucket located in the same region will be used.
         * 
         * @return builder
         * 
         */
        public Builder artifactStorage(@Nullable Output<String> artifactStorage) {
            $.artifactStorage = artifactStorage;
            return this;
        }

        /**
         * @param artifactStorage Optional. Cloud Storage location where execution outputs should be stored. This can either be a bucket (&#34;gs://my-bucket&#34;) or a path within a bucket (&#34;gs://my-bucket/my-dir&#34;). If unspecified, a default bucket located in the same region will be used.
         * 
         * @return builder
         * 
         */
        public Builder artifactStorage(String artifactStorage) {
            return artifactStorage(Output.of(artifactStorage));
        }

        /**
         * @param defaultPool Optional. Use default Cloud Build pool.
         * 
         * @return builder
         * 
         */
        public Builder defaultPool(@Nullable Output<DefaultPoolArgs> defaultPool) {
            $.defaultPool = defaultPool;
            return this;
        }

        /**
         * @param defaultPool Optional. Use default Cloud Build pool.
         * 
         * @return builder
         * 
         */
        public Builder defaultPool(DefaultPoolArgs defaultPool) {
            return defaultPool(Output.of(defaultPool));
        }

        /**
         * @param privatePool Optional. Use private Cloud Build pool.
         * 
         * @return builder
         * 
         */
        public Builder privatePool(@Nullable Output<PrivatePoolArgs> privatePool) {
            $.privatePool = privatePool;
            return this;
        }

        /**
         * @param privatePool Optional. Use private Cloud Build pool.
         * 
         * @return builder
         * 
         */
        public Builder privatePool(PrivatePoolArgs privatePool) {
            return privatePool(Output.of(privatePool));
        }

        /**
         * @param serviceAccount Optional. Google service account to use for execution. If unspecified, the project execution service account (-compute@developer.gserviceaccount.com) will be used.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * @param serviceAccount Optional. Google service account to use for execution. If unspecified, the project execution service account (-compute@developer.gserviceaccount.com) will be used.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(String serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        /**
         * @param usages Usages when this configuration should be applied.
         * 
         * @return builder
         * 
         */
        public Builder usages(Output<List<ExecutionConfigUsagesItem>> usages) {
            $.usages = usages;
            return this;
        }

        /**
         * @param usages Usages when this configuration should be applied.
         * 
         * @return builder
         * 
         */
        public Builder usages(List<ExecutionConfigUsagesItem> usages) {
            return usages(Output.of(usages));
        }

        /**
         * @param usages Usages when this configuration should be applied.
         * 
         * @return builder
         * 
         */
        public Builder usages(ExecutionConfigUsagesItem... usages) {
            return usages(List.of(usages));
        }

        /**
         * @param workerPool Optional. The resource name of the `WorkerPool`, with the format `projects/{project}/locations/{location}/workerPools/{worker_pool}`. If this optional field is unspecified, the default Cloud Build pool will be used.
         * 
         * @return builder
         * 
         */
        public Builder workerPool(@Nullable Output<String> workerPool) {
            $.workerPool = workerPool;
            return this;
        }

        /**
         * @param workerPool Optional. The resource name of the `WorkerPool`, with the format `projects/{project}/locations/{location}/workerPools/{worker_pool}`. If this optional field is unspecified, the default Cloud Build pool will be used.
         * 
         * @return builder
         * 
         */
        public Builder workerPool(String workerPool) {
            return workerPool(Output.of(workerPool));
        }

        public ExecutionConfigArgs build() {
            $.usages = Objects.requireNonNull($.usages, "expected parameter 'usages' to be non-null");
            return $;
        }
    }

}
