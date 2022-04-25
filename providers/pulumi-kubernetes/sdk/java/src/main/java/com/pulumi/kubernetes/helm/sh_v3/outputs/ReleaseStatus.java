// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.helm.sh_v3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ReleaseStatus {
    /**
     * @return The version number of the application being deployed.
     * 
     */
    private final @Nullable String appVersion;
    /**
     * @return The name of the chart.
     * 
     */
    private final @Nullable String chart;
    /**
     * @return Name is the name of the release.
     * 
     */
    private final @Nullable String name;
    /**
     * @return Namespace is the kubernetes namespace of the release.
     * 
     */
    private final @Nullable String namespace;
    /**
     * @return Version is an int32 which represents the version of the release.
     * 
     */
    private final @Nullable Integer revision;
    /**
     * @return Status of the release.
     * 
     */
    private final String status;
    /**
     * @return A SemVer 2 conformant version string of the chart.
     * 
     */
    private final @Nullable String version;

    @CustomType.Constructor
    private ReleaseStatus(
        @CustomType.Parameter("appVersion") @Nullable String appVersion,
        @CustomType.Parameter("chart") @Nullable String chart,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("namespace") @Nullable String namespace,
        @CustomType.Parameter("revision") @Nullable Integer revision,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("version") @Nullable String version) {
        this.appVersion = appVersion;
        this.chart = chart;
        this.name = name;
        this.namespace = namespace;
        this.revision = revision;
        this.status = status;
        this.version = version;
    }

    /**
     * @return The version number of the application being deployed.
     * 
     */
    public Optional<String> appVersion() {
        return Optional.ofNullable(this.appVersion);
    }
    /**
     * @return The name of the chart.
     * 
     */
    public Optional<String> chart() {
        return Optional.ofNullable(this.chart);
    }
    /**
     * @return Name is the name of the release.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Namespace is the kubernetes namespace of the release.
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * @return Version is an int32 which represents the version of the release.
     * 
     */
    public Optional<Integer> revision() {
        return Optional.ofNullable(this.revision);
    }
    /**
     * @return Status of the release.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return A SemVer 2 conformant version string of the chart.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReleaseStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String appVersion;
        private @Nullable String chart;
        private @Nullable String name;
        private @Nullable String namespace;
        private @Nullable Integer revision;
        private String status;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ReleaseStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appVersion = defaults.appVersion;
    	      this.chart = defaults.chart;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.revision = defaults.revision;
    	      this.status = defaults.status;
    	      this.version = defaults.version;
        }

        public Builder appVersion(@Nullable String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public Builder chart(@Nullable String chart) {
            this.chart = chart;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder revision(@Nullable Integer revision) {
            this.revision = revision;
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public ReleaseStatus build() {
            return new ReleaseStatus(appVersion, chart, name, namespace, revision, status, version);
        }
    }
}
