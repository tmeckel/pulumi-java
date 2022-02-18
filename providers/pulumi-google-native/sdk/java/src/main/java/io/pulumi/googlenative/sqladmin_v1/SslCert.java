// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.sqladmin_v1.SslCertArgs;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates an SSL certificate and returns it along with the private key and server certificate authority. The new certificate will not be usable until the instance is restarted.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:sqladmin/v1:SslCert")
public class SslCert extends io.pulumi.resources.CustomResource {
    /**
     * PEM representation.
     * 
     */
    @OutputExport(name="cert", type=String.class, parameters={})
    private Output<String> cert;

    /**
     * @return PEM representation.
     * 
     */
    public Output<String> getCert() {
        return this.cert;
    }
    /**
     * Serial number, as extracted from the certificate.
     * 
     */
    @OutputExport(name="certSerialNumber", type=String.class, parameters={})
    private Output<String> certSerialNumber;

    /**
     * @return Serial number, as extracted from the certificate.
     * 
     */
    public Output<String> getCertSerialNumber() {
        return this.certSerialNumber;
    }
    /**
     * User supplied name. Constrained to [a-zA-Z.-_ ]+.
     * 
     */
    @OutputExport(name="commonName", type=String.class, parameters={})
    private Output<String> commonName;

    /**
     * @return User supplied name. Constrained to [a-zA-Z.-_ ]+.
     * 
     */
    public Output<String> getCommonName() {
        return this.commonName;
    }
    /**
     * The time when the certificate was created in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time when the certificate was created in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The time when the certificate expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    @OutputExport(name="expirationTime", type=String.class, parameters={})
    private Output<String> expirationTime;

    /**
     * @return The time when the certificate expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    public Output<String> getExpirationTime() {
        return this.expirationTime;
    }
    /**
     * Name of the database instance.
     * 
     */
    @OutputExport(name="instance", type=String.class, parameters={})
    private Output<String> instance;

    /**
     * @return Name of the database instance.
     * 
     */
    public Output<String> getInstance() {
        return this.instance;
    }
    /**
     * This is always `sql#sslCert`.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return This is always `sql#sslCert`.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The URI of this resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of this resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * Sha1 Fingerprint.
     * 
     */
    @OutputExport(name="sha1Fingerprint", type=String.class, parameters={})
    private Output<String> sha1Fingerprint;

    /**
     * @return Sha1 Fingerprint.
     * 
     */
    public Output<String> getSha1Fingerprint() {
        return this.sha1Fingerprint;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SslCert(String name, SslCertArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:sqladmin/v1:SslCert", name, args == null ? SslCertArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SslCert(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:sqladmin/v1:SslCert", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SslCert get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SslCert(name, id, options);
    }
}
