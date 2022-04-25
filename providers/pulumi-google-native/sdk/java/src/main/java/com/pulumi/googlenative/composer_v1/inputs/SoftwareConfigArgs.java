// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.composer_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the selection and configuration of software inside the environment.
 * 
 */
public final class SoftwareConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final SoftwareConfigArgs Empty = new SoftwareConfigArgs();

    /**
     * Optional. Apache Airflow configuration properties to override. Property keys contain the section and property names, separated by a hyphen, for example &#34;core-dags_are_paused_at_creation&#34;. Section names must not contain hyphens (&#34;-&#34;), opening square brackets (&#34;[&#34;), or closing square brackets (&#34;]&#34;). The property name must not be empty and must not contain an equals sign (&#34;=&#34;) or semicolon (&#34;;&#34;). Section and property names must not contain a period (&#34;.&#34;). Apache Airflow configuration property names must be written in [snake_case](https://en.wikipedia.org/wiki/Snake_case). Property values can contain any character, and can be written in any lower/upper case format. Certain Apache Airflow configuration property values are [blocked](/composer/docs/concepts/airflow-configurations), and cannot be overridden.
     * 
     */
    @Import(name="airflowConfigOverrides")
    private @Nullable Output<Map<String,String>> airflowConfigOverrides;

    /**
     * @return Optional. Apache Airflow configuration properties to override. Property keys contain the section and property names, separated by a hyphen, for example &#34;core-dags_are_paused_at_creation&#34;. Section names must not contain hyphens (&#34;-&#34;), opening square brackets (&#34;[&#34;), or closing square brackets (&#34;]&#34;). The property name must not be empty and must not contain an equals sign (&#34;=&#34;) or semicolon (&#34;;&#34;). Section and property names must not contain a period (&#34;.&#34;). Apache Airflow configuration property names must be written in [snake_case](https://en.wikipedia.org/wiki/Snake_case). Property values can contain any character, and can be written in any lower/upper case format. Certain Apache Airflow configuration property values are [blocked](/composer/docs/concepts/airflow-configurations), and cannot be overridden.
     * 
     */
    public Optional<Output<Map<String,String>>> airflowConfigOverrides() {
        return Optional.ofNullable(this.airflowConfigOverrides);
    }

    /**
     * Optional. Additional environment variables to provide to the Apache Airflow scheduler, worker, and webserver processes. Environment variable names must match the regular expression `a-zA-Z_*`. They cannot specify Apache Airflow software configuration overrides (they cannot match the regular expression `AIRFLOW__[A-Z0-9_]+__[A-Z0-9_]+`), and they cannot match any of the following reserved names: * `AIRFLOW_HOME` * `C_FORCE_ROOT` * `CONTAINER_NAME` * `DAGS_FOLDER` * `GCP_PROJECT` * `GCS_BUCKET` * `GKE_CLUSTER_NAME` * `SQL_DATABASE` * `SQL_INSTANCE` * `SQL_PASSWORD` * `SQL_PROJECT` * `SQL_REGION` * `SQL_USER`
     * 
     */
    @Import(name="envVariables")
    private @Nullable Output<Map<String,String>> envVariables;

    /**
     * @return Optional. Additional environment variables to provide to the Apache Airflow scheduler, worker, and webserver processes. Environment variable names must match the regular expression `a-zA-Z_*`. They cannot specify Apache Airflow software configuration overrides (they cannot match the regular expression `AIRFLOW__[A-Z0-9_]+__[A-Z0-9_]+`), and they cannot match any of the following reserved names: * `AIRFLOW_HOME` * `C_FORCE_ROOT` * `CONTAINER_NAME` * `DAGS_FOLDER` * `GCP_PROJECT` * `GCS_BUCKET` * `GKE_CLUSTER_NAME` * `SQL_DATABASE` * `SQL_INSTANCE` * `SQL_PASSWORD` * `SQL_PROJECT` * `SQL_REGION` * `SQL_USER`
     * 
     */
    public Optional<Output<Map<String,String>>> envVariables() {
        return Optional.ofNullable(this.envVariables);
    }

    /**
     * The version of the software running in the environment. This encapsulates both the version of Cloud Composer functionality and the version of Apache Airflow. It must match the regular expression `composer-([0-9]+\.[0-9]+\.[0-9]+|latest)-airflow-[0-9]+\.[0-9]+(\.[0-9]+.*)?`. When used as input, the server also checks if the provided version is supported and denies the request for an unsupported version. The Cloud Composer portion of the version is a [semantic version](https://semver.org) or `latest`. When the patch version is omitted, the current Cloud Composer patch version is selected. When `latest` is provided instead of an explicit version number, the server replaces `latest` with the current Cloud Composer version and stores that version number in the same field. The portion of the image version that follows *airflow-* is an official Apache Airflow repository [release name](https://github.com/apache/incubator-airflow/releases). See also [Version List](/composer/docs/concepts/versioning/composer-versions).
     * 
     */
    @Import(name="imageVersion")
    private @Nullable Output<String> imageVersion;

    /**
     * @return The version of the software running in the environment. This encapsulates both the version of Cloud Composer functionality and the version of Apache Airflow. It must match the regular expression `composer-([0-9]+\.[0-9]+\.[0-9]+|latest)-airflow-[0-9]+\.[0-9]+(\.[0-9]+.*)?`. When used as input, the server also checks if the provided version is supported and denies the request for an unsupported version. The Cloud Composer portion of the version is a [semantic version](https://semver.org) or `latest`. When the patch version is omitted, the current Cloud Composer patch version is selected. When `latest` is provided instead of an explicit version number, the server replaces `latest` with the current Cloud Composer version and stores that version number in the same field. The portion of the image version that follows *airflow-* is an official Apache Airflow repository [release name](https://github.com/apache/incubator-airflow/releases). See also [Version List](/composer/docs/concepts/versioning/composer-versions).
     * 
     */
    public Optional<Output<String>> imageVersion() {
        return Optional.ofNullable(this.imageVersion);
    }

    /**
     * Optional. Custom Python Package Index (PyPI) packages to be installed in the environment. Keys refer to the lowercase package name such as &#34;numpy&#34; and values are the lowercase extras and version specifier such as &#34;==1.12.0&#34;, &#34;[devel,gcp_api]&#34;, or &#34;[devel]&gt;=1.8.2, &lt;1.9.2&#34;. To specify a package without pinning it to a version specifier, use the empty string as the value.
     * 
     */
    @Import(name="pypiPackages")
    private @Nullable Output<Map<String,String>> pypiPackages;

    /**
     * @return Optional. Custom Python Package Index (PyPI) packages to be installed in the environment. Keys refer to the lowercase package name such as &#34;numpy&#34; and values are the lowercase extras and version specifier such as &#34;==1.12.0&#34;, &#34;[devel,gcp_api]&#34;, or &#34;[devel]&gt;=1.8.2, &lt;1.9.2&#34;. To specify a package without pinning it to a version specifier, use the empty string as the value.
     * 
     */
    public Optional<Output<Map<String,String>>> pypiPackages() {
        return Optional.ofNullable(this.pypiPackages);
    }

    /**
     * Optional. The major version of Python used to run the Apache Airflow scheduler, worker, and webserver processes. Can be set to &#39;2&#39; or &#39;3&#39;. If not specified, the default is &#39;3&#39;. Cannot be updated. This field is only supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*. Environments in newer versions always use Python major version 3.
     * 
     */
    @Import(name="pythonVersion")
    private @Nullable Output<String> pythonVersion;

    /**
     * @return Optional. The major version of Python used to run the Apache Airflow scheduler, worker, and webserver processes. Can be set to &#39;2&#39; or &#39;3&#39;. If not specified, the default is &#39;3&#39;. Cannot be updated. This field is only supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*. Environments in newer versions always use Python major version 3.
     * 
     */
    public Optional<Output<String>> pythonVersion() {
        return Optional.ofNullable(this.pythonVersion);
    }

    /**
     * Optional. The number of schedulers for Airflow. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-2.*.*.
     * 
     */
    @Import(name="schedulerCount")
    private @Nullable Output<Integer> schedulerCount;

    /**
     * @return Optional. The number of schedulers for Airflow. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-2.*.*.
     * 
     */
    public Optional<Output<Integer>> schedulerCount() {
        return Optional.ofNullable(this.schedulerCount);
    }

    private SoftwareConfigArgs() {}

    private SoftwareConfigArgs(SoftwareConfigArgs $) {
        this.airflowConfigOverrides = $.airflowConfigOverrides;
        this.envVariables = $.envVariables;
        this.imageVersion = $.imageVersion;
        this.pypiPackages = $.pypiPackages;
        this.pythonVersion = $.pythonVersion;
        this.schedulerCount = $.schedulerCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SoftwareConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SoftwareConfigArgs $;

        public Builder() {
            $ = new SoftwareConfigArgs();
        }

        public Builder(SoftwareConfigArgs defaults) {
            $ = new SoftwareConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param airflowConfigOverrides Optional. Apache Airflow configuration properties to override. Property keys contain the section and property names, separated by a hyphen, for example &#34;core-dags_are_paused_at_creation&#34;. Section names must not contain hyphens (&#34;-&#34;), opening square brackets (&#34;[&#34;), or closing square brackets (&#34;]&#34;). The property name must not be empty and must not contain an equals sign (&#34;=&#34;) or semicolon (&#34;;&#34;). Section and property names must not contain a period (&#34;.&#34;). Apache Airflow configuration property names must be written in [snake_case](https://en.wikipedia.org/wiki/Snake_case). Property values can contain any character, and can be written in any lower/upper case format. Certain Apache Airflow configuration property values are [blocked](/composer/docs/concepts/airflow-configurations), and cannot be overridden.
         * 
         * @return builder
         * 
         */
        public Builder airflowConfigOverrides(@Nullable Output<Map<String,String>> airflowConfigOverrides) {
            $.airflowConfigOverrides = airflowConfigOverrides;
            return this;
        }

        /**
         * @param airflowConfigOverrides Optional. Apache Airflow configuration properties to override. Property keys contain the section and property names, separated by a hyphen, for example &#34;core-dags_are_paused_at_creation&#34;. Section names must not contain hyphens (&#34;-&#34;), opening square brackets (&#34;[&#34;), or closing square brackets (&#34;]&#34;). The property name must not be empty and must not contain an equals sign (&#34;=&#34;) or semicolon (&#34;;&#34;). Section and property names must not contain a period (&#34;.&#34;). Apache Airflow configuration property names must be written in [snake_case](https://en.wikipedia.org/wiki/Snake_case). Property values can contain any character, and can be written in any lower/upper case format. Certain Apache Airflow configuration property values are [blocked](/composer/docs/concepts/airflow-configurations), and cannot be overridden.
         * 
         * @return builder
         * 
         */
        public Builder airflowConfigOverrides(Map<String,String> airflowConfigOverrides) {
            return airflowConfigOverrides(Output.of(airflowConfigOverrides));
        }

        /**
         * @param envVariables Optional. Additional environment variables to provide to the Apache Airflow scheduler, worker, and webserver processes. Environment variable names must match the regular expression `a-zA-Z_*`. They cannot specify Apache Airflow software configuration overrides (they cannot match the regular expression `AIRFLOW__[A-Z0-9_]+__[A-Z0-9_]+`), and they cannot match any of the following reserved names: * `AIRFLOW_HOME` * `C_FORCE_ROOT` * `CONTAINER_NAME` * `DAGS_FOLDER` * `GCP_PROJECT` * `GCS_BUCKET` * `GKE_CLUSTER_NAME` * `SQL_DATABASE` * `SQL_INSTANCE` * `SQL_PASSWORD` * `SQL_PROJECT` * `SQL_REGION` * `SQL_USER`
         * 
         * @return builder
         * 
         */
        public Builder envVariables(@Nullable Output<Map<String,String>> envVariables) {
            $.envVariables = envVariables;
            return this;
        }

        /**
         * @param envVariables Optional. Additional environment variables to provide to the Apache Airflow scheduler, worker, and webserver processes. Environment variable names must match the regular expression `a-zA-Z_*`. They cannot specify Apache Airflow software configuration overrides (they cannot match the regular expression `AIRFLOW__[A-Z0-9_]+__[A-Z0-9_]+`), and they cannot match any of the following reserved names: * `AIRFLOW_HOME` * `C_FORCE_ROOT` * `CONTAINER_NAME` * `DAGS_FOLDER` * `GCP_PROJECT` * `GCS_BUCKET` * `GKE_CLUSTER_NAME` * `SQL_DATABASE` * `SQL_INSTANCE` * `SQL_PASSWORD` * `SQL_PROJECT` * `SQL_REGION` * `SQL_USER`
         * 
         * @return builder
         * 
         */
        public Builder envVariables(Map<String,String> envVariables) {
            return envVariables(Output.of(envVariables));
        }

        /**
         * @param imageVersion The version of the software running in the environment. This encapsulates both the version of Cloud Composer functionality and the version of Apache Airflow. It must match the regular expression `composer-([0-9]+\.[0-9]+\.[0-9]+|latest)-airflow-[0-9]+\.[0-9]+(\.[0-9]+.*)?`. When used as input, the server also checks if the provided version is supported and denies the request for an unsupported version. The Cloud Composer portion of the version is a [semantic version](https://semver.org) or `latest`. When the patch version is omitted, the current Cloud Composer patch version is selected. When `latest` is provided instead of an explicit version number, the server replaces `latest` with the current Cloud Composer version and stores that version number in the same field. The portion of the image version that follows *airflow-* is an official Apache Airflow repository [release name](https://github.com/apache/incubator-airflow/releases). See also [Version List](/composer/docs/concepts/versioning/composer-versions).
         * 
         * @return builder
         * 
         */
        public Builder imageVersion(@Nullable Output<String> imageVersion) {
            $.imageVersion = imageVersion;
            return this;
        }

        /**
         * @param imageVersion The version of the software running in the environment. This encapsulates both the version of Cloud Composer functionality and the version of Apache Airflow. It must match the regular expression `composer-([0-9]+\.[0-9]+\.[0-9]+|latest)-airflow-[0-9]+\.[0-9]+(\.[0-9]+.*)?`. When used as input, the server also checks if the provided version is supported and denies the request for an unsupported version. The Cloud Composer portion of the version is a [semantic version](https://semver.org) or `latest`. When the patch version is omitted, the current Cloud Composer patch version is selected. When `latest` is provided instead of an explicit version number, the server replaces `latest` with the current Cloud Composer version and stores that version number in the same field. The portion of the image version that follows *airflow-* is an official Apache Airflow repository [release name](https://github.com/apache/incubator-airflow/releases). See also [Version List](/composer/docs/concepts/versioning/composer-versions).
         * 
         * @return builder
         * 
         */
        public Builder imageVersion(String imageVersion) {
            return imageVersion(Output.of(imageVersion));
        }

        /**
         * @param pypiPackages Optional. Custom Python Package Index (PyPI) packages to be installed in the environment. Keys refer to the lowercase package name such as &#34;numpy&#34; and values are the lowercase extras and version specifier such as &#34;==1.12.0&#34;, &#34;[devel,gcp_api]&#34;, or &#34;[devel]&gt;=1.8.2, &lt;1.9.2&#34;. To specify a package without pinning it to a version specifier, use the empty string as the value.
         * 
         * @return builder
         * 
         */
        public Builder pypiPackages(@Nullable Output<Map<String,String>> pypiPackages) {
            $.pypiPackages = pypiPackages;
            return this;
        }

        /**
         * @param pypiPackages Optional. Custom Python Package Index (PyPI) packages to be installed in the environment. Keys refer to the lowercase package name such as &#34;numpy&#34; and values are the lowercase extras and version specifier such as &#34;==1.12.0&#34;, &#34;[devel,gcp_api]&#34;, or &#34;[devel]&gt;=1.8.2, &lt;1.9.2&#34;. To specify a package without pinning it to a version specifier, use the empty string as the value.
         * 
         * @return builder
         * 
         */
        public Builder pypiPackages(Map<String,String> pypiPackages) {
            return pypiPackages(Output.of(pypiPackages));
        }

        /**
         * @param pythonVersion Optional. The major version of Python used to run the Apache Airflow scheduler, worker, and webserver processes. Can be set to &#39;2&#39; or &#39;3&#39;. If not specified, the default is &#39;3&#39;. Cannot be updated. This field is only supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*. Environments in newer versions always use Python major version 3.
         * 
         * @return builder
         * 
         */
        public Builder pythonVersion(@Nullable Output<String> pythonVersion) {
            $.pythonVersion = pythonVersion;
            return this;
        }

        /**
         * @param pythonVersion Optional. The major version of Python used to run the Apache Airflow scheduler, worker, and webserver processes. Can be set to &#39;2&#39; or &#39;3&#39;. If not specified, the default is &#39;3&#39;. Cannot be updated. This field is only supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*. Environments in newer versions always use Python major version 3.
         * 
         * @return builder
         * 
         */
        public Builder pythonVersion(String pythonVersion) {
            return pythonVersion(Output.of(pythonVersion));
        }

        /**
         * @param schedulerCount Optional. The number of schedulers for Airflow. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-2.*.*.
         * 
         * @return builder
         * 
         */
        public Builder schedulerCount(@Nullable Output<Integer> schedulerCount) {
            $.schedulerCount = schedulerCount;
            return this;
        }

        /**
         * @param schedulerCount Optional. The number of schedulers for Airflow. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-2.*.*.
         * 
         * @return builder
         * 
         */
        public Builder schedulerCount(Integer schedulerCount) {
            return schedulerCount(Output.of(schedulerCount));
        }

        public SoftwareConfigArgs build() {
            return $;
        }
    }

}
