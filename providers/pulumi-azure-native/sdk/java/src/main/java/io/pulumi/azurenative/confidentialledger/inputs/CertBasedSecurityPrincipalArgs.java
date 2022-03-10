// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.confidentialledger.inputs;

import io.pulumi.azurenative.confidentialledger.enums.LedgerRoleName;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Cert based security principal with Ledger RoleName
 * 
 */
public final class CertBasedSecurityPrincipalArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertBasedSecurityPrincipalArgs Empty = new CertBasedSecurityPrincipalArgs();

    /**
     * Base64 encoded public key of the user cert (.pem or .cer)
     * 
     */
    @InputImport(name="cert")
      private final @Nullable Input<String> cert;

    public Input<String> getCert() {
        return this.cert == null ? Input.empty() : this.cert;
    }

    /**
     * LedgerRole associated with the Security Principal of Ledger
     * 
     */
    @InputImport(name="ledgerRoleName")
      private final @Nullable Input<Either<String,LedgerRoleName>> ledgerRoleName;

    public Input<Either<String,LedgerRoleName>> getLedgerRoleName() {
        return this.ledgerRoleName == null ? Input.empty() : this.ledgerRoleName;
    }

    public CertBasedSecurityPrincipalArgs(
        @Nullable Input<String> cert,
        @Nullable Input<Either<String,LedgerRoleName>> ledgerRoleName) {
        this.cert = cert;
        this.ledgerRoleName = ledgerRoleName;
    }

    private CertBasedSecurityPrincipalArgs() {
        this.cert = Input.empty();
        this.ledgerRoleName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertBasedSecurityPrincipalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cert;
        private @Nullable Input<Either<String,LedgerRoleName>> ledgerRoleName;

        public Builder() {
    	      // Empty
        }

        public Builder(CertBasedSecurityPrincipalArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cert = defaults.cert;
    	      this.ledgerRoleName = defaults.ledgerRoleName;
        }

        public Builder cert(@Nullable Input<String> cert) {
            this.cert = cert;
            return this;
        }

        public Builder cert(@Nullable String cert) {
            this.cert = Input.ofNullable(cert);
            return this;
        }

        public Builder ledgerRoleName(@Nullable Input<Either<String,LedgerRoleName>> ledgerRoleName) {
            this.ledgerRoleName = ledgerRoleName;
            return this;
        }

        public Builder ledgerRoleName(@Nullable Either<String,LedgerRoleName> ledgerRoleName) {
            this.ledgerRoleName = Input.ofNullable(ledgerRoleName);
            return this;
        }
        public CertBasedSecurityPrincipalArgs build() {
            return new CertBasedSecurityPrincipalArgs(cert, ledgerRoleName);
        }
    }
}
