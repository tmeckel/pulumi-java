// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Options to configure the Helm Release resource.
 * 
 */
public final class HelmReleaseSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final HelmReleaseSettingsArgs Empty = new HelmReleaseSettingsArgs();

    /**
     * The backend storage driver for Helm. Values are: configmap, secret, memory, sql.
     * 
     */
    @Import(name="driver")
    private @Nullable Output<String> driver;

    /**
     * @return The backend storage driver for Helm. Values are: configmap, secret, memory, sql.
     * 
     */
    public Optional<Output<String>> driver() {
        return Optional.ofNullable(this.driver);
    }

    /**
     * The path to the helm plugins directory.
     * 
     */
    @Import(name="pluginsPath")
    private @Nullable Output<String> pluginsPath;

    /**
     * @return The path to the helm plugins directory.
     * 
     */
    public Optional<Output<String>> pluginsPath() {
        return Optional.ofNullable(this.pluginsPath);
    }

    /**
     * The path to the registry config file.
     * 
     */
    @Import(name="registryConfigPath")
    private @Nullable Output<String> registryConfigPath;

    /**
     * @return The path to the registry config file.
     * 
     */
    public Optional<Output<String>> registryConfigPath() {
        return Optional.ofNullable(this.registryConfigPath);
    }

    /**
     * The path to the file containing cached repository indexes.
     * 
     */
    @Import(name="repositoryCache")
    private @Nullable Output<String> repositoryCache;

    /**
     * @return The path to the file containing cached repository indexes.
     * 
     */
    public Optional<Output<String>> repositoryCache() {
        return Optional.ofNullable(this.repositoryCache);
    }

    /**
     * The path to the file containing repository names and URLs.
     * 
     */
    @Import(name="repositoryConfigPath")
    private @Nullable Output<String> repositoryConfigPath;

    /**
     * @return The path to the file containing repository names and URLs.
     * 
     */
    public Optional<Output<String>> repositoryConfigPath() {
        return Optional.ofNullable(this.repositoryConfigPath);
    }

    private HelmReleaseSettingsArgs() {}

    private HelmReleaseSettingsArgs(HelmReleaseSettingsArgs $) {
        this.driver = $.driver;
        this.pluginsPath = $.pluginsPath;
        this.registryConfigPath = $.registryConfigPath;
        this.repositoryCache = $.repositoryCache;
        this.repositoryConfigPath = $.repositoryConfigPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HelmReleaseSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HelmReleaseSettingsArgs $;

        public Builder() {
            $ = new HelmReleaseSettingsArgs();
        }

        public Builder(HelmReleaseSettingsArgs defaults) {
            $ = new HelmReleaseSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param driver The backend storage driver for Helm. Values are: configmap, secret, memory, sql.
         * 
         * @return builder
         * 
         */
        public Builder driver(@Nullable Output<String> driver) {
            $.driver = driver;
            return this;
        }

        /**
         * @param driver The backend storage driver for Helm. Values are: configmap, secret, memory, sql.
         * 
         * @return builder
         * 
         */
        public Builder driver(String driver) {
            return driver(Output.of(driver));
        }

        /**
         * @param pluginsPath The path to the helm plugins directory.
         * 
         * @return builder
         * 
         */
        public Builder pluginsPath(@Nullable Output<String> pluginsPath) {
            $.pluginsPath = pluginsPath;
            return this;
        }

        /**
         * @param pluginsPath The path to the helm plugins directory.
         * 
         * @return builder
         * 
         */
        public Builder pluginsPath(String pluginsPath) {
            return pluginsPath(Output.of(pluginsPath));
        }

        /**
         * @param registryConfigPath The path to the registry config file.
         * 
         * @return builder
         * 
         */
        public Builder registryConfigPath(@Nullable Output<String> registryConfigPath) {
            $.registryConfigPath = registryConfigPath;
            return this;
        }

        /**
         * @param registryConfigPath The path to the registry config file.
         * 
         * @return builder
         * 
         */
        public Builder registryConfigPath(String registryConfigPath) {
            return registryConfigPath(Output.of(registryConfigPath));
        }

        /**
         * @param repositoryCache The path to the file containing cached repository indexes.
         * 
         * @return builder
         * 
         */
        public Builder repositoryCache(@Nullable Output<String> repositoryCache) {
            $.repositoryCache = repositoryCache;
            return this;
        }

        /**
         * @param repositoryCache The path to the file containing cached repository indexes.
         * 
         * @return builder
         * 
         */
        public Builder repositoryCache(String repositoryCache) {
            return repositoryCache(Output.of(repositoryCache));
        }

        /**
         * @param repositoryConfigPath The path to the file containing repository names and URLs.
         * 
         * @return builder
         * 
         */
        public Builder repositoryConfigPath(@Nullable Output<String> repositoryConfigPath) {
            $.repositoryConfigPath = repositoryConfigPath;
            return this;
        }

        /**
         * @param repositoryConfigPath The path to the file containing repository names and URLs.
         * 
         * @return builder
         * 
         */
        public Builder repositoryConfigPath(String repositoryConfigPath) {
            return repositoryConfigPath(Output.of(repositoryConfigPath));
        }

        public HelmReleaseSettingsArgs build() {
            $.driver = Codegen.stringProp("driver").output().arg($.driver).env("PULUMI_K8S_HELM_DRIVER").getNullable();
            $.pluginsPath = Codegen.stringProp("pluginsPath").output().arg($.pluginsPath).env("PULUMI_K8S_HELM_PLUGINS_PATH").getNullable();
            $.registryConfigPath = Codegen.stringProp("registryConfigPath").output().arg($.registryConfigPath).env("PULUMI_K8S_HELM_REGISTRY_CONFIG_PATH").getNullable();
            $.repositoryCache = Codegen.stringProp("repositoryCache").output().arg($.repositoryCache).env("PULUMI_K8S_HELM_REPOSITORY_CACHE").getNullable();
            $.repositoryConfigPath = Codegen.stringProp("repositoryConfigPath").output().arg($.repositoryConfigPath).env("PULUMI_K8S_HELM_REPOSITORY_CONFIG_PATH").getNullable();
            return $;
        }
    }

}
