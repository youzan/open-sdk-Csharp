using System;
using open_sdk.common.constant;

namespace open_sdk.auth
{
    public class Sign : IAuth
    {
        /**
         * 身份凭证
         */
        private readonly string identify;
        /**
         * 应用私钥
         */
        private readonly string clientPrivateKey;
        /**
         * youzan公钥
         */
        private readonly string youzanPublicKey;

        /**
         * 对应查询公钥的查询Id
         */
        private readonly string publicKeyId;

        /**
         * 签名
         */
        private readonly Signature signature;

        public Sign(string identify, string clientPrivateKey, string youzanPublicKey, string publicKeyId, Signature signature)
        {
            this.identify = identify;
            this.clientPrivateKey = clientPrivateKey;
            this.youzanPublicKey = youzanPublicKey;
            this.publicKeyId = publicKeyId;
            this.signature = signature;
        }

        public string Identify{ get; set; }

        public string ClientPrivateKey { get; set; }

        public string YouzanPublicKey { get; set; }

        public string PublicKeyId { get; set; }

        public string Signature { get; set; }

        OAuthEnum IAuth.GetType()
        {
           return OAuthEnum.SIGN;
        }


        public override string ToString()
        {
            return "Sign{" +
                    "signatureType=" + signature +
                    ", identify='" + identify + '\'' +
                    ", clientPrivateKey='" + clientPrivateKey + '\'' +
                    ", youzanPublicKey='" + youzanPublicKey + '\'' +
                    ", publicKeyId='" + publicKeyId + '\'' +
                    '}';
        }

       
    }
}
