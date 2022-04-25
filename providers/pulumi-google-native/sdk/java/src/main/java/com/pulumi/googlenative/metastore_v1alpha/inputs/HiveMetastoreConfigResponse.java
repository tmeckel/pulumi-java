// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore_v1alpha.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.metastore_v1alpha.inputs.KerberosConfigResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Specifies configuration information specific to running Hive metastore software as the metastore service.
 * 
 */
public final class HiveMetastoreConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final HiveMetastoreConfigResponse Empty = new HiveMetastoreConfigResponse();

    /**
     * A mapping of Hive metastore version to the auxiliary version configuration. When specified, a secondary Hive metastore service is created along with the primary service. All auxiliary versions must be less than the service&#39;s primary version. The key is the auxiliary service name and it must match the regular expression a-z?. This means that the first character must be a lowercase letter, and all the following characters must be hyphens, lowercase letters, or digits, except the last character, which cannot be a hyphen.
     * 
     */
    @Import(name="auxiliaryVersions", required=true)
    private Map<String,String> auxiliaryVersions;

    /**
     * @return A mapping of Hive metastore version to the auxiliary version configuration. When specified, a secondary Hive metastore service is created along with the primary service. All auxiliary versions must be less than the service&#39;s primary version. The key is the auxiliary service name and it must match the regular expression a-z?. This means that the first character must be a lowercase letter, and all the following characters must be hyphens, lowercase letters, or digits, except the last character, which cannot be a hyphen.
     * 
     */
    public Map<String,String> auxiliaryVersions() {
        return this.auxiliaryVersions;
    }

    /**
     * A mapping of Hive metastore configuration key-value pairs to apply to the Hive metastore (configured in hive-site.xml). The mappings override system defaults (some keys cannot be overridden). These overrides are also applied to auxiliary versions and can be further customized in the auxiliary version&#39;s AuxiliaryVersionConfig.
     * 
     */
    @Import(name="configOverrides", required=true)
    private Map<String,String> configOverrides;

    /**
     * @return A mapping of Hive metastore configuration key-value pairs to apply to the Hive metastore (configured in hive-site.xml). The mappings override system defaults (some keys cannot be overridden). These overrides are also applied to auxiliary versions and can be further customized in the auxiliary version&#39;s AuxiliaryVersionConfig.
     * 
     */
    public Map<String,String> configOverrides() {
        return this.configOverrides;
    }

    /**
     * The protocol to use for the metastore service endpoint. If unspecified, defaults to THRIFT.
     * 
     */
    @Import(name="endpointProtocol", required=true)
    private String endpointProtocol;

    /**
     * @return The protocol to use for the metastore service endpoint. If unspecified, defaults to THRIFT.
     * 
     */
    public String endpointProtocol() {
        return this.endpointProtocol;
    }

    /**
     * Information used to configure the Hive metastore service as a service principal in a Kerberos realm. To disable Kerberos, use the UpdateService method and specify this field&#39;s path (hive_metastore_config.kerberos_config) in the request&#39;s update_mask while omitting this field from the request&#39;s service.
     * 
     */
    @Import(name="kerberosConfig", required=true)
    private KerberosConfigResponse kerberosConfig;

    /**
     * @return Information used to configure the Hive metastore service as a service principal in a Kerberos realm. To disable Kerberos, use the UpdateService method and specify this field&#39;s path (hive_metastore_config.kerberos_config) in the request&#39;s update_mask while omitting this field from the request&#39;s service.
     * 
     */
    public KerberosConfigResponse kerberosConfig() {
        return this.kerberosConfig;
    }

    /**
     * Immutable. The Hive metastore schema version.
     * 
     */
    @Import(name="version", required=true)
    private String version;

    /**
     * @return Immutable. The Hive metastore schema version.
     * 
     */
    public String version() {
        return this.version;
    }

    private HiveMetastoreConfigResponse() {}

    private HiveMetastoreConfigResponse(HiveMetastoreConfigResponse $) {
        this.auxiliaryVersions = $.auxiliaryVersions;
        this.configOverrides = $.configOverrides;
        this.endpointProtocol = $.endpointProtocol;
        this.kerberosConfig = $.kerberosConfig;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HiveMetastoreConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HiveMetastoreConfigResponse $;

        public Builder() {
            $ = new HiveMetastoreConfigResponse();
        }

        public Builder(HiveMetastoreConfigResponse defaults) {
            $ = new HiveMetastoreConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param auxiliaryVersions A mapping of Hive metastore version to the auxiliary version configuration. When specified, a secondary Hive metastore service is created along with the primary service. All auxiliary versions must be less than the service&#39;s primary version. The key is the auxiliary service name and it must match the regular expression a-z?. This means that the first character must be a lowercase letter, and all the following characters must be hyphens, lowercase letters, or digits, except the last character, which cannot be a hyphen.
         * 
         * @return builder
         * 
         */
        public Builder auxiliaryVersions(Map<String,String> auxiliaryVersions) {
            $.auxiliaryVersions = auxiliaryVersions;
            return this;
        }

        /**
         * @param configOverrides A mapping of Hive metastore configuration key-value pairs to apply to the Hive metastore (configured in hive-site.xml). The mappings override system defaults (some keys cannot be overridden). These overrides are also applied to auxiliary versions and can be further customized in the auxiliary version&#39;s AuxiliaryVersionConfig.
         * 
         * @return builder
         * 
         */
        public Builder configOverrides(Map<String,String> configOverrides) {
            $.configOverrides = configOverrides;
            return this;
        }

        /**
         * @param endpointProtocol The protocol to use for the metastore service endpoint. If unspecified, defaults to THRIFT.
         * 
         * @return builder
         * 
         */
        public Builder endpointProtocol(String endpointProtocol) {
            $.endpointProtocol = endpointProtocol;
            return this;
        }

        /**
         * @param kerberosConfig Information used to configure the Hive metastore service as a service principal in a Kerberos realm. To disable Kerberos, use the UpdateService method and specify this field&#39;s path (hive_metastore_config.kerberos_config) in the request&#39;s update_mask while omitting this field from the request&#39;s service.
         * 
         * @return builder
         * 
         */
        public Builder kerberosConfig(KerberosConfigResponse kerberosConfig) {
            $.kerberosConfig = kerberosConfig;
            return this;
        }

        /**
         * @param version Immutable. The Hive metastore schema version.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            $.version = version;
            return this;
        }

        public HiveMetastoreConfigResponse build() {
            $.auxiliaryVersions = Objects.requireNonNull($.auxiliaryVersions, "expected parameter 'auxiliaryVersions' to be non-null");
            $.configOverrides = Objects.requireNonNull($.configOverrides, "expected parameter 'configOverrides' to be non-null");
            $.endpointProtocol = Objects.requireNonNull($.endpointProtocol, "expected parameter 'endpointProtocol' to be non-null");
            $.kerberosConfig = Objects.requireNonNull($.kerberosConfig, "expected parameter 'kerberosConfig' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
