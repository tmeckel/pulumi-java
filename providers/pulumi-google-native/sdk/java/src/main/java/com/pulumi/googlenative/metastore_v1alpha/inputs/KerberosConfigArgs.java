// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore_v1alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.metastore_v1alpha.inputs.SecretArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration information for a Kerberos principal.
 * 
 */
public final class KerberosConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final KerberosConfigArgs Empty = new KerberosConfigArgs();

    /**
     * A Kerberos keytab file that can be used to authenticate a service principal with a Kerberos Key Distribution Center (KDC).
     * 
     */
    @Import(name="keytab")
    private @Nullable Output<SecretArgs> keytab;

    /**
     * @return A Kerberos keytab file that can be used to authenticate a service principal with a Kerberos Key Distribution Center (KDC).
     * 
     */
    public Optional<Output<SecretArgs>> keytab() {
        return Optional.ofNullable(this.keytab);
    }

    /**
     * A Cloud Storage URI that specifies the path to a krb5.conf file. It is of the form gs://{bucket_name}/path/to/krb5.conf, although the file does not need to be named krb5.conf explicitly.
     * 
     */
    @Import(name="krb5ConfigGcsUri")
    private @Nullable Output<String> krb5ConfigGcsUri;

    /**
     * @return A Cloud Storage URI that specifies the path to a krb5.conf file. It is of the form gs://{bucket_name}/path/to/krb5.conf, although the file does not need to be named krb5.conf explicitly.
     * 
     */
    public Optional<Output<String>> krb5ConfigGcsUri() {
        return Optional.ofNullable(this.krb5ConfigGcsUri);
    }

    /**
     * A Kerberos principal that exists in the both the keytab the KDC to authenticate as. A typical principal is of the form primary/instance@REALM, but there is no exact format.
     * 
     */
    @Import(name="principal")
    private @Nullable Output<String> principal;

    /**
     * @return A Kerberos principal that exists in the both the keytab the KDC to authenticate as. A typical principal is of the form primary/instance@REALM, but there is no exact format.
     * 
     */
    public Optional<Output<String>> principal() {
        return Optional.ofNullable(this.principal);
    }

    private KerberosConfigArgs() {}

    private KerberosConfigArgs(KerberosConfigArgs $) {
        this.keytab = $.keytab;
        this.krb5ConfigGcsUri = $.krb5ConfigGcsUri;
        this.principal = $.principal;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KerberosConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KerberosConfigArgs $;

        public Builder() {
            $ = new KerberosConfigArgs();
        }

        public Builder(KerberosConfigArgs defaults) {
            $ = new KerberosConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keytab A Kerberos keytab file that can be used to authenticate a service principal with a Kerberos Key Distribution Center (KDC).
         * 
         * @return builder
         * 
         */
        public Builder keytab(@Nullable Output<SecretArgs> keytab) {
            $.keytab = keytab;
            return this;
        }

        /**
         * @param keytab A Kerberos keytab file that can be used to authenticate a service principal with a Kerberos Key Distribution Center (KDC).
         * 
         * @return builder
         * 
         */
        public Builder keytab(SecretArgs keytab) {
            return keytab(Output.of(keytab));
        }

        /**
         * @param krb5ConfigGcsUri A Cloud Storage URI that specifies the path to a krb5.conf file. It is of the form gs://{bucket_name}/path/to/krb5.conf, although the file does not need to be named krb5.conf explicitly.
         * 
         * @return builder
         * 
         */
        public Builder krb5ConfigGcsUri(@Nullable Output<String> krb5ConfigGcsUri) {
            $.krb5ConfigGcsUri = krb5ConfigGcsUri;
            return this;
        }

        /**
         * @param krb5ConfigGcsUri A Cloud Storage URI that specifies the path to a krb5.conf file. It is of the form gs://{bucket_name}/path/to/krb5.conf, although the file does not need to be named krb5.conf explicitly.
         * 
         * @return builder
         * 
         */
        public Builder krb5ConfigGcsUri(String krb5ConfigGcsUri) {
            return krb5ConfigGcsUri(Output.of(krb5ConfigGcsUri));
        }

        /**
         * @param principal A Kerberos principal that exists in the both the keytab the KDC to authenticate as. A typical principal is of the form primary/instance@REALM, but there is no exact format.
         * 
         * @return builder
         * 
         */
        public Builder principal(@Nullable Output<String> principal) {
            $.principal = principal;
            return this;
        }

        /**
         * @param principal A Kerberos principal that exists in the both the keytab the KDC to authenticate as. A typical principal is of the form primary/instance@REALM, but there is no exact format.
         * 
         * @return builder
         * 
         */
        public Builder principal(String principal) {
            return principal(Output.of(principal));
        }

        public KerberosConfigArgs build() {
            return $;
        }
    }

}
